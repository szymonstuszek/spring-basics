package pl.mentoring.devs.firstspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.mentoring.devs.firstspringproject.model.User;
import pl.mentoring.devs.firstspringproject.processor.CustomBeanPostProcessor;

@Configuration
public class LifecycleConfig {

    @Bean
    public CustomBeanPostProcessor myBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean(initMethod = "initUser", destroyMethod = "destroyUser")
    public User user() {
        return new User();
    }
}
