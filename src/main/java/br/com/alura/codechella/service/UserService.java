package br.com.alura.codechella.service;

import br.com.alura.codechella.infrastructure.persistence.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity registerUser(UserEntity user);

    List<UserEntity> listAll();
}
