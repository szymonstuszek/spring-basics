package pl.mentoring.devs.firstspringproject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationService {

    @Value("${app.age}")
    private int age;

    @Value("${app.countries}")
    private List<String> countries;

    @Value("${app.newsletter.subscription}")
    private boolean subscribed;

    public int getAge() {
        return age;
    }

    public List<String> getCountries() {
        return countries;
    }

    public boolean isSubscribed() {
        return subscribed;
    }
}
