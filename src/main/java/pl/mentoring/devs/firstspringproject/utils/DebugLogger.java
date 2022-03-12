package pl.mentoring.devs.firstspringproject.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DebugLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("=================================");
        System.out.println("Running application in debug mode");
        System.out.println(message);
        System.out.println("Message logged at: " + LocalDateTime.now());
        System.out.println("=================================");
    }
}
