package Fifth;

import org.springframework.stereotype.Component;

@Component
public class BadStudent implements Student {
    public void StudentIs(){
        System.out.println("This is bad student");
    }
}
