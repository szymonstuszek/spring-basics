package pl.mentoring.devs.firstspringproject.service;

import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.beans.MessageProducer;
import pl.mentoring.devs.firstspringproject.repository.WebDao;

import java.util.List;

@Component
public final class WebService {

    private final WebDao webDao;
    private final MessageProducer funnyMessage;

    public WebService(WebDao webDao, MessageProducer funnyMessage) {
        this.webDao = webDao;
        this.funnyMessage = funnyMessage;
    }

    public List<String> getAvailableClasses() {
        return webDao.findAvailableClasses();
    }

    public void showMessage() {
        funnyMessage.showMessage();
    }
}
