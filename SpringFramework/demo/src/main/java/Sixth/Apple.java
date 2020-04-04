package Sixth;

import org.springframework.stereotype.Component;

@Component
public class Apple {
    @Autowired
    public Apple(){}
    public void display(){
        System.out.println("This is an apple");
    }
}
