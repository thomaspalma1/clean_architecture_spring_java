package br.com.alura.codechella.service;

import br.com.alura.codechella.model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);

    List<User> listAll();
}
