package Sixth;

import Third.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sixth {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Fruit.class,args);
        Fruit fruit = applicationContext.getBean(Fruit.class);
        fruit.print();

    }
}
