package com.artyom.project;

import com.artyom.project.data.phone.PhoneCrudRepositoryImpl;
import com.artyom.project.data.phone.PhoneCrudRepository;
import com.artyom.project.data.user.UserStorageImpl;
import com.artyom.project.data.user.UserCrudRepository;
import com.artyom.project.data.user.UserCrudRepositoryImpl;
import com.artyom.project.service.phone.PhoneInteractor;
import com.artyom.project.service.user.UserInteractor;
import com.artyom.project.service.user.UserIteractorImpl;
import com.artyom.project.service.user.UserStorage;
import com.artyom.project.data.phone.PhoneStorageImpl;
import com.artyom.project.service.phone.PhoneStorage;
import com.artyom.project.service.phone.PhoneInteractorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    PhoneInteractor phoneInteractor(PhoneStorage storage) {
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
    UserInteractor userStorageImpl(UserStorage storage) {
        return new UserIteractorImpl((UserStorageImpl) storage);
    }

}
