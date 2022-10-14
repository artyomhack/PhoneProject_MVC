package com.artyom.system.controller;

import com.artyom.system.service.user.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/")
    public ModelAndView getMainPage() {
        var model = new ModelAndView();

        model.setViewName("index");
        return model;
    }
}
