package com.artyom.system.controller;

import com.artyom.system.service.phone.PhoneDetails;
import com.artyom.system.service.phone.PhoneInteractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    private final PhoneInteractor interaction;

    public MainController(PhoneInteractor interaction) {
        this.interaction = interaction;
    }


    @GetMapping("/")
    public ModelAndView getMainPage() {
        var model = new ModelAndView();

        model.setViewName("index");
        return model;
    }

    @PostMapping("/createPhone")
    public ModelAndView createPhone(PhoneDetails details) {
        var phone =
    }

}
