package com.RestfulAssignmentPart1.RestfulAssignment.Question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

@GetMapping(path="/welcome")
    public WelcomeBean welcomeBean(){
    return new WelcomeBean("Welcome to Spring Boot");
}

}
