package pl.mentoring.devs.firstspringproject.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import pl.mentoring.devs.firstspringproject.model.Solution;
import pl.mentoring.devs.firstspringproject.model.User;
import pl.mentoring.devs.firstspringproject.persistence.CacheSolutionSaver;
import pl.mentoring.devs.firstspringproject.persistence.DatabaseSolutionSaver;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @SpyBean
    private CacheSolutionSaver cacheSolutionSaver;

    @SpyBean
    private DatabaseSolutionSaver databaseSolutionSaver;

    @Test
    void whenRegisteredUserSavesToDatabase() {
        User registeredUser = new User(true);
        Solution solution = new Solution("A");


        taskService.saveSolution(registeredUser, solution);
        verify(cacheSolutionSaver, never()).saveSolution(any());
        verify(databaseSolutionSaver, times(1)).saveSolution(any());
    }

    @Test
    void whenUnregisteredUserSavesToCache() {
        User guest = new User(false);
        Solution solution = new Solution("A");


        taskService.saveSolution(guest, solution);
        verify(cacheSolutionSaver, times(1)).saveSolution(any());
        verify(databaseSolutionSaver, never()).saveSolution(any());
    }
}