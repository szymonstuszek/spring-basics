package pl.mentoring.devs.firstspringproject.utils;

import org.springframework.stereotype.Component;

@Component
public class RegularLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
