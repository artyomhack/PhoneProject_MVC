package com.artyom.system.controller;

import com.artyom.system.model.phone.PhoneModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.artyom.system.service.phone.PhoneDetails;
import com.artyom.system.service.phone.PhoneStorageImpl;
import com.artyom.system.service.user.UserStorageImpl;

import java.util.Objects;

@Controller
@RequestMapping("/main")
public class MainController {

    private final PhoneStorageImpl phoneRepository;
    private final UserStorageImpl userRepository;

    public MainController(PhoneStorageImpl phoneRepository, UserStorageImpl userRepository) {
        this.phoneRepository = phoneRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/s")
    public String getString() {
        return "hello_word";
    }

    @GetMapping("/create/{id}")
    public ModelAndView showCreatePhone() {
        return showPage(null);
    }

    @PostMapping("/create")
    public ModelAndView createNumber(PhoneDetails request) {
        var phoneId = phoneRepository.add(request.getNumber());
        var phone = phoneRepository.findById(phoneId);

        if (Objects.nonNull(phone))
            return showPage(phone);

        return new ModelAndView("redirect:/main/create/" + phoneId);
    }

    private ModelAndView showPage(PhoneModel phoneModel) {
        var model = new ModelAndView();

        if (Objects.nonNull(phoneModel)) {
            model.getModelMap().addAttribute("id", phoneModel.getId());
            model.getModelMap().addAttribute("number", phoneModel.getNumberOfPhone());
        }

        model.setViewName("hello_world");
        return model;
    }
}
