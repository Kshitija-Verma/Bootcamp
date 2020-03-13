package Fifth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Fifth {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Fifth.class,args);
        Teacher teacher=applicationContext.getBean(Teacher.class);
        teacher.studentAnalyse();

    }
}
