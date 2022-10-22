package com.artyom.project.controller;

import com.artyom.project.service.phone.PhoneInteractorImpl;
import com.artyom.project.service.user.UserInteractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    private final PhoneInteractorImpl interaction;
    private final UserInteractor interactor;

    public MainController(PhoneInteractorImpl interaction, UserInteractor interactor) {
        this.interaction = interaction;
        this.interactor = interactor;
    }

    @GetMapping("/")
    public String getMainPage() {
        return "menu";
    }

    @PostMapping("/{id}")
    public ModelAndView getUser(@PathVariable String id) {
        return null;
    }


}
