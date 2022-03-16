package pl.mentoring.devs.firstspringproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import pl.mentoring.devs.firstspringproject.service.MailService;
import pl.mentoring.devs.firstspringproject.service.MessagingService;
import pl.mentoring.devs.firstspringproject.service.MobileService;

@Configuration
public class AppConfig {

    @Value("${mail.server}")
    private String mailServer;

    @Bean
    public MessagingService mobile() {
        return new MobileService();
    }

    @Bean
    @Primary
    public MessagingService mail() {
        return new MailService(mailServer);
    }
}
