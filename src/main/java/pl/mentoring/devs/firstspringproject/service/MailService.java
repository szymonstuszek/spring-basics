package pl.mentoring.devs.firstspringproject.service;

public class MailService implements MessagingService {

    private final String mailServer;

    public MailService(String mailServer) {
        this.mailServer = mailServer;
    }

    @Override
    public void send() {
        System.out.println("Connecting to: " + mailServer + " - sending email reminder");
    }
}
