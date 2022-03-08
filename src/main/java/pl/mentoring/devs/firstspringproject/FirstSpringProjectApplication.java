package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.controller.WebController;

import java.util.List;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

	 	WebController controller = (WebController) context.getBean("webController");
	 	List<String> classes = controller.getAvailableClasses();
		System.out.println("Following classes are available: " + classes);
	}
}
