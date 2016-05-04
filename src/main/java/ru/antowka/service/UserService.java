package ru.antowka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antowka.domain.User;
import ru.antowka.repository.UserRepository;

/**
 * Created by anton on 05.05.16.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByName(String login){
        return userRepository.findByName(login);
    }
}
