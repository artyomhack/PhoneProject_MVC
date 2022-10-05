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

@Configuration
@ComponentScan("system")
@EnableWebMvc
public class MyConfig {

    @Bean
    DataFileRepositoryImp<PhoneModel, PhoneNumberId> getDataFilePhoneRepository
            (AbstractFileRepository<PhoneModel, PhoneNumberId> repository) {
        return new FilePhoneRepository(repository);
    }

    @Bean
    DataFileRepositoryImp<UserModel, UserFileId> getDataFileUserRepository
            (AbstractFileRepository<UserModel, UserFileId> repository) {
        return new FileUserRepository(repository);
    }


}
