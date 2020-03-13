package Fifth;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GoodStudent implements Student {
    public void StudentIs(){
        System.out.println("This student is good");
    }
}
