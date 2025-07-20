package br.com.alura.codechella.configuration;


import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.application.usecases.CreateUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    CreateUser createUser(UserRepository userRepository){
        return new CreateUser(userRepository);
    }
}
