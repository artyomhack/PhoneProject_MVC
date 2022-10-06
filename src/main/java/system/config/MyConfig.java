package system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import system.data.phone.FilePhoneRepository;
import system.data.user.FileUserRepository;
import system.file.AbstractFileRepository;
import system.file.DataFileRepositoryImp;
import system.model.phone.PhoneModel;
import system.model.phone.PhoneNumberId;
import system.model.user.UserFileId;
import system.model.user.UserModel;
import system.service.phone.PhoneStorage;
import system.service.phone.PhoneStorageImpl;
import system.service.user.UserStorage;
import system.service.user.UserStorageImpl;

@Configuration
@ComponentScan("system")
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
    PhoneStorageImpl getPhoneStorageImpl(FilePhoneRepository repository) {
        return new PhoneStorageImpl(repository);
    }

    @Bean
    UserStorageImpl getPhoneStorageImpl(FileUserRepository repository) {
        return new UserStorageImpl(repository);
    }
}
