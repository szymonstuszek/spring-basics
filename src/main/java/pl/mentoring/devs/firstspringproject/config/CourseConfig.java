package pl.mentoring.devs.firstspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.mentoring.devs.firstspringproject.model.Course;

@Configuration
public class CourseConfig {

    @Bean
    public Course course() {
        return new Course();
    }
}
