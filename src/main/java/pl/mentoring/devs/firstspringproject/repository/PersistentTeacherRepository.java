package pl.mentoring.devs.firstspringproject.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Teacher;

import java.util.List;

@Profile("prod")
@Component
public class PersistentTeacherRepository implements TeacherRepository {

    @Override
    public List<Teacher> getTeachers() {
        Teacher teacher1 = new Teacher("Max", List.of("English", "Accounting"));
        Teacher teacher2 = new Teacher("John", List.of("Design", "Analytics"));
        Teacher teacher3 = new Teacher("Rick", List.of("Yoga", "Nutrition"));

        return List.of(teacher1, teacher2, teacher3);
    }
}
