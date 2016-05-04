package ru.antowka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.antowka.repository.UserRepository;

/**
 * Created by anton on 04.05.16.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String mainPage(Model model){
        return "static/index.html";
    }
}
