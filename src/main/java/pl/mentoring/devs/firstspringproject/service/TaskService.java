package pl.mentoring.devs.firstspringproject.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Solution;
import pl.mentoring.devs.firstspringproject.model.User;
import pl.mentoring.devs.firstspringproject.persistence.SolutionSaver;

@Component
public class TaskService {

    private final SolutionSaver db;
    private final SolutionSaver cache;

    public TaskService(@Qualifier("databaseSaver") SolutionSaver dbSaver,
                       @Qualifier("cacheSaver") SolutionSaver tempSaver) {
        this.db = dbSaver;
        this.cache = tempSaver;
    }

    public void saveSolution(User user, Solution solution) {
        if (user.isRegistered()) {
            db.saveSolution(solution);
        } else {
            cache.saveSolution(solution);
        }
    }
}
