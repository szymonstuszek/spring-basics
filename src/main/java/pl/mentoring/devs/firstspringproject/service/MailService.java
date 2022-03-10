package pl.mentoring.devs.firstspringproject.service;

public class MailService implements MessagingService {

    @Override
    public void send() {
        System.out.println("Sending email reminder.");
    }
}
