package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.model.Course;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

		Course course = (Course) context.getBean("course");
		Course course2 = (Course) context.getBean("course");

		course.setName("Math");

		System.out.println("Updated name for course: " + course.getName());
		System.out.println("Updated name for course2: " + course2.getName());

	}
}
