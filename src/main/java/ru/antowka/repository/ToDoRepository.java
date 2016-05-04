package ru.antowka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.antowka.domain.Task;
import ru.antowka.domain.User;

import java.util.List;

/**
 * Created by anton on 04.05.16.
 */
@Repository
public interface ToDoRepository extends CrudRepository<Task, String> {

    List<Task> findByUser(User user);
}
