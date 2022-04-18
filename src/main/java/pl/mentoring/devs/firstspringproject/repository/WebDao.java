package pl.mentoring.devs.firstspringproject.repository;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class WebDao {

    public List<String> findAvailableClasses() {
        return List.of("Programming", "Marketing", "English");
    }
}
