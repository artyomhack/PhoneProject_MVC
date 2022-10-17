package com.artyom.system.config;

import com.artyom.system.data.phone.PhoneCrudRepository;
import com.artyom.system.data.phone.PhoneCrudRepositoryImpl;
import com.artyom.system.data.user.UserStorageImpl;
import com.artyom.system.data.user.UserCrudRepository;
import com.artyom.system.data.user.UserCrudRepositoryImpl;
import com.artyom.system.service.user.UserInteractorImpl;
import com.artyom.system.service.user.UserStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.artyom.system.data.phone.PhoneStorageImpl;
import com.artyom.system.service.phone.PhoneStorage;
import com.artyom.system.service.phone.PhoneInteractorImpl;

@Configuration
public class MyConfig {

    @Bean
    PhoneCrudRepository phoneCrudRepository() {
        return new PhoneCrudRepositoryImpl();
    }

    @Bean
    PhoneStorage phoneStorage(PhoneCrudRepository phoneRepository) {
        return new PhoneStorageImpl(phoneRepository);
    }

    @Bean
    PhoneInteractorImpl phoneInteractor(PhoneStorage storage) {
        return new PhoneInteractorImpl(storage);
    }

    @Bean
    UserCrudRepository userCrudRepository() {
        return new UserCrudRepositoryImpl();
    }

    @Bean
    UserStorage userStorage(UserCrudRepository userRepository) {
        return new UserStorageImpl(userRepository);
    }

    @Bean
    UserInteractorImpl userStorageImpl(UserStorage storage) {
        return new UserInteractorImpl(storage);
    }
}
