package ru.antowka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.antowka.service.ToDoService;

/**
 * Created by anton on 04.05.16.
 */
@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;


}
