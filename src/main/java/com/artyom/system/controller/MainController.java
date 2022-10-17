package com.artyom.system.controller;

import com.artyom.system.model.user.UserFileId;
import com.artyom.system.service.phone.PhoneInteractorImpl;
import com.artyom.system.service.user.UserInteractorImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    private final PhoneInteractorImpl interaction;
    private final UserInteractorImpl interactor;

    public MainController(PhoneInteractorImpl interaction) {
        this.interaction = interaction;
    }


    @GetMapping("/")
    public ModelAndView getMainPage() {
        var model = new ModelAndView();

        model.setViewName("index");
        return model;
    }

    @PostMapping("/{id}")
    public ModelAndView getUser(@PathVariable String id) {
        var userId = UserFileId.of(id);

    }


}
