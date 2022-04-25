package pl.mentoring.devs.firstspringproject.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Solution;
import pl.mentoring.devs.firstspringproject.model.User;
import pl.mentoring.devs.firstspringproject.persistence.SolutionSaver;

@Component
public class TaskServiceWiring {

    private final SolutionSaver solutionSaver;

    public TaskServiceWiring(@Qualifier("databaseSaver") SolutionSaver cacheSolutionSaver) {
        this.solutionSaver = cacheSolutionSaver;
    }

    public void saveSolution(Solution solution) {
        solutionSaver.saveSolution(solution);
    }
}
