import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = appContext.getBean("userService", UserService.class);

        System.out.println(userService.getUsers().get(0).getName());
    }
}