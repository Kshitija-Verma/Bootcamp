package com.tothenew.bootcamp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

interface Employee{
    public void doWork();
}

@Component
class Trainer{
    @Autowired
    private Employee employee;

}
@SpringBootApplication
public class Third {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Third.class,args);

    }
}
