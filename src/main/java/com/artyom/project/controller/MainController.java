package com.artyom.project.controller;

import com.artyom.project.model.phone.PhoneNumberId;
import com.artyom.project.service.phone.PhoneDetails;
import com.artyom.project.service.phone.PhoneInteractorImpl;
import com.artyom.project.service.user.UserInteractor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

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
        var phone = interaction.fetchById(PhoneNumberId.of(id));

        return showPhonePage(phone);
    }

    @GetMapping("/createPhone")
    public ModelAndView showCreatePhone() {
        return showPhonePage(null);
    }

    @PostMapping(value = "/createPhone", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView createPhone(PhoneDetails details) {
        var phone = interaction.fetchById(interaction.add(details));

        if (Objects.isNull(phone))
            return showPhonePage(phone);

        return new ModelAndView("redirect:/createPhone/" + phone.getId());
    }

    private ModelAndView showPhonePage(PhoneDetails details) {
        var model = new ModelAndView();

        if (Objects.nonNull(details)) {
            model.getModelMap().addAttribute("id", details.getId());
            model.getModelMap().addAttribute("number", details.getNumber());
        }

        model.setViewName("form_phone");
        return model;
    }
}
