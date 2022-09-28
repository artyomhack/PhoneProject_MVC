package system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import system.dao.PhoneRepository;
import system.file.FileRepository;
import system.service.PhoneStorage;

@Configuration
@ComponentScan("system")
@EnableWebMvc
public class MyConfig {

    @Bean
    public PhoneStorage getPhoneStorage (PhoneRepository repository) {
        return new PhoneStorage(repository);
    }

    @Bean
    public PhoneRepository getPhoneRepository() {
        return new PhoneRepository();
    }
}
