package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.service.TeacherService;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

		TeacherService teacherService = (TeacherService) context.getBean("teacherService");
		System.out.println(teacherService.getTeachers());
	}
}
