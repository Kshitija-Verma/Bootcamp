package com.RestfulApp2.RestfulApp2.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EnhancedUserController {
    @Autowired
    private EnhancedUserService enhancedUserService;
//versioning using URI
    //@GetMapping(path="/v2/users")
    //versioning using request parameter
//@GetMapping(path="/users/param",params = "version=2")
    //versioning using custom header versioning
    @GetMapping(path="/users/header",headers="X-API-VERSION=2")
    //versioning using MIME versioning
   // @GetMapping(path="/users/produces" , produces = "application/vnd.company.app-v2+json")
    public List<EnhancedUser> retrieveAllUsers(){
        return enhancedUserService.findAll();

    }
    @GetMapping(path="/v2/users/{id}")
    //versioning using request parameter
//@GetMapping(path="/users/{id}/param",params = "version=2")
    //versioning using custom header versioning
    // @GetMapping(path="/users/{id}/header",headers="X=API-VERSION=2")
    //versioning using MIME versioning
    //@GetMapping(path="/users/produces" , produces = "application/vnd.company.app-v2+json")
    public EnhancedUser retrieveOne(@PathVariable int id){
        EnhancedUser user = enhancedUserService.findOne(id);

        if(user==null)
            return user;
        return null;
    }


    @PostMapping("/v2/users")
    //versioning using request parameter
//@PostMapping(path="/users/param",params = "version=2")
    //versioning using custom header versioning
    // @PostMapping(path="/users/header",headers="X=API-VERSION=2")
    //versioning using MIME versioning
    //@PostMapping(path="/users/produces" , produces = "application/vnd.company.app-v2+json")
    public ResponseEntity<Object> createUser(@Valid @RequestBody EnhancedUser enhancedUser){
        EnhancedUser users = enhancedUserService.save(enhancedUser);

        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(users.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
}
