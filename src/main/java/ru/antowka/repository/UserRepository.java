package ru.antowka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.antowka.domain.User;

/**
 * Created by anton on 04.05.16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByName(String login);
}