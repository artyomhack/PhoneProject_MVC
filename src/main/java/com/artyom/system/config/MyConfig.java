package com.artyom.system.config;

import com.artyom.system.data.phone.PhoneCrudRepository;
import com.artyom.system.data.user.FileUserCrudRepository;
import com.artyom.system.data.user.UserCrudRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.user.UserInteractor;
import com.artyom.system.service.user.UserStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.artyom.system.data.phone.FilePhoneCrudRepository;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.service.phone.PhoneStorage;
import com.artyom.system.service.phone.PhoneInteractor;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.artyom.system")
public class MyConfig {

    @Bean
    PhoneStorage getPhoneStorage(PhoneCrudRepository phoneRepository, Class<PhoneModel> phoneModel) {
        return new FilePhoneCrudRepository(phoneRepository, phoneModel);
    }

    @Bean
    PhoneInteractor getPhoneStorageImpl(PhoneStorage storage) {
        return new PhoneInteractor(storage);
    }

    @Bean
    UserStorage getUserStorage(UserCrudRepository userRepository, Class<UserModel> userModel) {
        return new FileUserCrudRepository(userRepository,userModel);
    }

    @Bean
    UserInteractor getUserStorageImpl(UserStorage storage) {
        return new UserInteractor(storage);
    }
}
