package Third;

import org.springframework.stereotype.Component;

@Component
public class Trainee implements Employee {

    @Override
    public void doWork() {
        System.out.println("Trainee is working");
    }


}
