package pl.mentoring.devs.firstspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.mentoring.devs.firstspringproject.model.Course;

@Configuration
public class CourseConfig {

    @Bean
    @Scope("prototype")
    public Course course() {
        return new Course("Consulting");
    }
}
