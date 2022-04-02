package pl.mentoring.devs.firstspringproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.mentoring.devs.firstspringproject.beans.MessageProducer;

@Configuration
public class MessageConfig {


    @Bean
    public MessageProducer funnyMessage() {
        return new MessageProducer("Let me tell you a joke...");
    }

    @Bean
    public MessageProducer sadMessage() {
        return new MessageProducer("Something terrible happened...");
    }
}
