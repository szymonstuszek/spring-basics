package pl.mentoring.devs.firstspringproject.persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.mentoring.devs.firstspringproject.model.Solution;

@Component
@Qualifier("cacheSaver")
public class CacheSolutionSaver implements SolutionSaver {

    @Override
    public void saveSolution(Solution solution) {
        System.out.println("Saving to cache");
    }
}
