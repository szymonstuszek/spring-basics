package pl.mentoring.devs.firstspringproject.model;

import java.util.List;

public class Teacher {

    private final String name;
    private final List<String> subjects;

    public Teacher(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
