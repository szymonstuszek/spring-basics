package pl.mentoring.devs.firstspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.mentoring.devs.firstspringproject.model.Lesson;

@Configuration
public class LessonConfig {

    @Bean
    @Scope("singleton")
    public Lesson lesson() {
        return new Lesson("Consulting");
    }
}
