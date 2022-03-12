package pl.mentoring.devs.firstspringproject.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Teacher;

import java.util.List;

@Profile("dev")
@Component
public class InMemoryTeacherRepository implements TeacherRepository {

    @Override
    public List<Teacher> getTeachers() {
        Teacher teacher1 = new Teacher("testName1", List.of("testSubject1", "testSubject2"));
        Teacher teacher2 = new Teacher("testName2", List.of("testSubject1", "testSubject3"));
        Teacher teacher3 = new Teacher("testName3", List.of("testSubject2", "testSubject3"));

        return List.of(teacher1, teacher2, teacher3);
    }
}
