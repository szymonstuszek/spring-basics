package pl.mentoring.devs.firstspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.mentoring.devs.firstspringproject.service.RegistrationService;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

		RegistrationService registrationService = (RegistrationService) context.getBean("registrationService");
		System.out.println("Minimum age of user: " + registrationService.getAge());
		System.out.println("Available countries: " + registrationService.getCountries());
		System.out.println("Subscribe to newsletter: " + registrationService.isSubscribed());
	}
}
