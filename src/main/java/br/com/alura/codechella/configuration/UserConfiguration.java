package br.com.alura.codechella.configuration;


import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUsers;
import br.com.alura.codechella.infrastructure.gateways.UserRepositoryJPA;
import br.com.alura.codechella.infrastructure.gateways.UserEntityMapper;
import br.com.alura.codechella.infrastructure.persistence.UserJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    CreateUser createUser(UserRepository userRepository) {
        return new CreateUser(userRepository);
    }

    @Bean
    ListUsers listUsers(UserRepository userRepository) {
        return new ListUsers(userRepository);
    }

    @Bean
    UserRepository userRepository(
            UserJpaRepository userJpaRepository,
            UserEntityMapper userEntityMapper) {
        return new UserRepositoryJPA(userJpaRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }
}
