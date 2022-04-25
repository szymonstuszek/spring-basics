package pl.mentoring.devs.firstspringproject.persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Solution;

@Component
@Qualifier("databaseSaver")
public class DatabaseSolutionSaver implements SolutionSaver {

    @Override
    public void saveSolution(Solution solution) {
        System.out.println("Saving to database");
    }
}
