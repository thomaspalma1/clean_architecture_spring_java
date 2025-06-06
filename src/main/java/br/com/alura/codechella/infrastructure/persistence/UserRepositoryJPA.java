package br.com.alura.codechella.infrastructure.persistence;

import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public class UserRepositoryJPA implements UserRepository {

    private final UserRepositoryJPA userRepositoryJPA;

    public UserRepositoryJPA(UserRepositoryJPA userRepositoryJPA) {
        this.userRepositoryJPA = userRepositoryJPA;
    }

    @Override
    public User registerUser(User user) {
        return userRepositoryJPA.save(user);
    }

    @Override
    public List<User> listAll() {
        return userRepositoryJPA.findAll();
    }
}

