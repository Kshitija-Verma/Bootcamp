package com.RestfulApp2.RestfulApp2.Employee;

import com.RestfulApp2.RestfulApp2.Users.BasicUserController;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

//@ApiModel(description = "All the controlling methods for employees")
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

//@ApiModelProperty(notes = "GET the details of all employees")
    @GetMapping(path="/employees")
    public List<EmployeeBean> retrieveAllEmployees(){
        return employeeService.findAll();

    }
//@ApiModelProperty(notes = "GET the detail of a particular employee by giving its id number")
    @GetMapping(path="/employees/{id}")
    public EntityModel<EmployeeBean> retrieveOne(@PathVariable int id){
        EmployeeBean employeeBean = employeeService.findOne(id);

        if(employeeBean==null)
            throw new EmployeeNotFoundException("id"+id);
    EntityModel<EmployeeBean> model = new EntityModel<>(employeeBean);
    WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(methodOn(this.getClass()).retrieveAllEmployees());
    model.add(linkTo.withRel("all-users"));
        return model;
    }


//@ApiModelProperty(notes="ADD the details for new employees")
    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody EmployeeBean employeeBean){
        EmployeeBean employee = employeeService.save(employeeBean);

        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
    //@ApiModelProperty(notes = "DELETE the details of existing employee using its id number")
    @DeleteMapping(path="/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        EmployeeBean employeeBean = employeeService.deleteById(id);
        //Question 6 - throwing exception for resource not found
        if(employeeBean==null)
            throw new EmployeeNotFoundException("id"+id);



    }


}

