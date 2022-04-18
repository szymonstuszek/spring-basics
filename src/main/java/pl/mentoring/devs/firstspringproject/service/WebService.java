package pl.mentoring.devs.firstspringproject.service;

import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.repository.WebDao;

import java.util.List;

//@Component
public final class WebService {

    private final WebDao webDao;

    public WebService(WebDao webDao) {
        this.webDao = webDao;
    }

    public List<String> getAvailableClasses() {
        return webDao.findAvailableClasses();
    }
}
