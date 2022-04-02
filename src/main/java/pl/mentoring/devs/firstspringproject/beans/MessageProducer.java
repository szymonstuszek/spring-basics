package pl.mentoring.devs.firstspringproject.beans;

public class MessageProducer {

    private String message;

    public MessageProducer(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
}
