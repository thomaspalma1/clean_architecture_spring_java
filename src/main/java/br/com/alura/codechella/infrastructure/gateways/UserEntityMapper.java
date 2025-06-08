package br.com.alura.codechella.infrastructure.gateways;

import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infrastructure.persistence.UserEntity;

public class UserEntityMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(
                user.getCpf(),
                user.getName(),
                user.getDateOfBirth(),
                user.getEmail()
        );
    }

    public User toDomain(UserEntity entity) {
        return new User(
                entity.getCpf(),
                entity.getName(),
                entity.getDateOfBirth(),
                entity.getEmail()
        );
    }
}
