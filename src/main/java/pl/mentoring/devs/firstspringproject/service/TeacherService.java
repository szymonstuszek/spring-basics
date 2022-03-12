package pl.mentoring.devs.firstspringproject.service;

import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Teacher;
import pl.mentoring.devs.firstspringproject.repository.TeacherRepository;

import java.util.List;

@Component
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.getTeachers();
    }
}
