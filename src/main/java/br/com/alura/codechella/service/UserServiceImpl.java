package br.com.alura.codechella.service;

import br.com.alura.codechella.infrastructure.persistence.UserEntity;
import br.com.alura.codechella.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserEntity registerUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public List<UserEntity> listAll() {
        return repository.findAll();
    }
}
