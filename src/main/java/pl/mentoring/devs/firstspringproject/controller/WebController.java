package pl.mentoring.devs.firstspringproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.repository.WebDao;
import pl.mentoring.devs.firstspringproject.service.WebService;

import java.util.List;

//@Component
public class WebController {

    private final WebService webService;

    public WebController(WebService webService) {
        this.webService = webService;
    }

    public List<String> getAvailableClasses() {
        return webService.getAvailableClasses();
    }
}
