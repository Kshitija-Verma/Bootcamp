package com.RestfulApp2.RestfulApp2.Users;

import com.RestfulApp2.RestfulApp2.Employee.EmployeeBean;
import com.RestfulApp2.RestfulApp2.Employee.EmployeeNotFoundException;
//import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class BasicUserController {
    @Autowired
    private BasicUserService basicUserService;
//versioning using URI
   // @GetMapping(path="/v1/users")
    //versioning using request parameter
  //  @GetMapping(path="/users/param",params = "version=1")
    //versioning using custom header versioning
     @GetMapping(path="/users/header",headers="X-API-VERSION=1")
    //versioning using MIME versioning
    //@GetMapping(path="/users/produces" , produces = "application/vnd.company.app-v1+json")
    public List<BasicUser> retrieveAllUsers(){
        return basicUserService.findAll();

    }
    @GetMapping(path="/v1/users/{id}")
    //versioning using request parameter
  //  @GetMapping(path="/users/{id}/param",params = "version=1")
    //versioning using custom header versioning
    // @GetMapping(path="/users/header",headers="X=API-VERSION=1")
    //versioning using MIME versioning
    //@GetMapping(path="/users/produces" , produces = "application/vnd.company.app-v1+json")
    public BasicUser retrieveOne(@PathVariable int id){
        BasicUser user = basicUserService.findOne(id);

        if(user==null)
            return user;
        return null;
    }


    @PostMapping("/v1/users")
    //versioning using request parameter
   // @PostMapping(path="/users/param",params = "version=1")
    //versioning using custom header versioning
    // @PostMapping(path="/users/header",headers="X=API-VERSION=1")
    //versioning using MIME versioning
    //@PostMapping(path="/users/produces" , produces = "application/vnd.company.app-v1+json")
    public ResponseEntity<Object> createUser(@Valid @RequestBody BasicUser basicUser){
        BasicUser users = basicUserService.save(basicUser);

        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(users.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
}
