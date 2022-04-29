package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.model.Lesson;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

		Lesson lesson = (Lesson) context.getBean("lesson");
		Lesson lesson2 = (Lesson) context.getBean("lesson");

		lesson.setName("Math");

		System.out.println("Updated name for lesson: " + lesson.getName());
		System.out.println("Updated name for lesson2: " + lesson2.getName());

	}
}
