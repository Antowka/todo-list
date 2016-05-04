package ru.antowka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antowka.domain.Task;
import ru.antowka.domain.User;
import ru.antowka.repository.ToDoRepository;

import java.util.List;

/**
 * Created by anton on 04.05.16.
 */
@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public Task create(Task task){
        return toDoRepository.save(task);
    }

    public void update(Task task){
        toDoRepository.save(task);
    }

    public List<Task> findByUser(User user) {
        return toDoRepository.findByUser(user);
    }

    public void remove(Task task) {
        toDoRepository.delete(task);
    }
}
