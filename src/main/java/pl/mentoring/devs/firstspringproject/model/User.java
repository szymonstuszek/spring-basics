package pl.mentoring.devs.firstspringproject.model;

public class User {
    private boolean registered;

    public User(boolean registered) {
        this.registered = registered;
    }

    public boolean isRegistered() {
        return registered;
    }
}
