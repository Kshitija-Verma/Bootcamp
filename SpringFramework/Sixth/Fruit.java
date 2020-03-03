package Sixth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Fruit {
     @Bean
     Apple apple() {
             return new Apple();
         }
         public void print(){
             apple().display();
         }
}

