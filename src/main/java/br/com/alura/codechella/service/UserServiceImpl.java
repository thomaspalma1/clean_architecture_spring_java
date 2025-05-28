package br.com.alura.codechella.service;

import br.com.alura.codechella.model.User;
import br.com.alura.codechella.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User registerUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> listAll() {
        return repository.findAll();
    }
}
