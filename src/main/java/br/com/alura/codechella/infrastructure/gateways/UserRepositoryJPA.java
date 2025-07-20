package br.com.alura.codechella.infrastructure.gateways;

import br.com.alura.codechella.application.gateways.UserRepository;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infrastructure.persistence.UserEntity;
import br.com.alura.codechella.infrastructure.persistence.UserJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepositoryJPA implements UserRepository {

    private final UserJpaRepository repository;
    private final UserEntityMapper mapper;

    public UserRepositoryJPA(
            UserJpaRepository repository,
            UserEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public User registerUser(User user) {
        UserEntity entity = mapper.toEntity(user);
        repository.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<User> listAll() {
        return repository
                .findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}

