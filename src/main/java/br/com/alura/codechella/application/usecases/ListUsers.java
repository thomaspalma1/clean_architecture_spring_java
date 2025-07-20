package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.application.gateways.UserRepository;

import java.util.List;

public class ListUsers {

    private final UserRepository userRepository;

    public ListUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.listAll();
    }
}
