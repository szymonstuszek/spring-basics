package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.model.Solution;
import pl.mentoring.devs.firstspringproject.model.User;
import pl.mentoring.devs.firstspringproject.service.TaskService;
import pl.mentoring.devs.firstspringproject.service.TaskServiceWiring;


@SpringBootApplication
public class FirstSpringProjectApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

		TaskService taskService = (TaskService) context.getBean("taskService");

		User registeredUser = new User(true);
		Solution registeredUsersSolution = new Solution("A");

		User guest = new User(false);
		Solution guestSolution = new Solution("B");


		taskService.saveSolution(registeredUser, registeredUsersSolution);
		taskService.saveSolution(guest, guestSolution);

		//if a qualifier is provided it takes precedence over wiring by name
		TaskServiceWiring taskServiceWiring = (TaskServiceWiring) context.getBean("taskServiceWiring");
		taskServiceWiring.saveSolution(new Solution("C"));

	}
}
