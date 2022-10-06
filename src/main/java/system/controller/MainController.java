package system.controller;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.service.phone.PhoneDetails;
import system.service.phone.PhoneStorage;
import system.service.phone.PhoneStorageImpl;
import system.service.user.UserStorage;
import system.service.user.UserStorageImpl;

import java.util.Objects;

@Controller
@RequestMapping("/main")
public class MainController {

    PhoneStorageImpl phoneRepository;
    UserStorageImpl userRepository;

    public MainController(PhoneStorageImpl phoneRepository, UserStorageImpl userRepository) {
        this.phoneRepository = phoneRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/create/{id}}")
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

        model.setViewName("phone_form");
        return model;
    }
}
