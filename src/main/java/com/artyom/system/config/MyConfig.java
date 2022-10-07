package com.artyom.system.config;

import com.artyom.system.file.AbstractFileRepository;
import com.artyom.system.model.phone.PhoneModel;
import com.artyom.system.service.user.UserStorageImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.artyom.system.data.phone.FilePhoneRepository;
import com.artyom.system.data.user.FileUserRepository;
import com.artyom.system.model.phone.PhoneNumberId;
import com.artyom.system.model.user.UserFileId;
import com.artyom.system.model.user.UserModel;
import com.artyom.system.service.phone.PhoneStorage;
import com.artyom.system.service.phone.PhoneStorageImpl;
import com.artyom.system.service.user.UserStorage;

@Configuration
@ComponentScan("com.artyom.system")
@EnableWebMvc
public class MyConfig {

    @Bean
    FilePhoneRepository getFilePhoneRepository
            (AbstractFileRepository<PhoneModel, PhoneNumberId> repository) {
        return new FilePhoneRepository(repository);
    }

    @Bean
    FileUserRepository getFileUserRepository
            (AbstractFileRepository<UserModel, UserFileId> repository) {
        return new FileUserRepository(repository);
    }

    @Bean
    UserStorage getUserStorage(FileUserRepository repository) {
        return new UserStorageImpl(repository);
    }

    @Bean
    PhoneStorage getPhoneStorage(FilePhoneRepository repository) {
        return new PhoneStorageImpl(repository);
    }

    @Bean
    PhoneStorageImpl getPhoneStorageImpl() {
        return new PhoneStorageImpl()
    }
}
