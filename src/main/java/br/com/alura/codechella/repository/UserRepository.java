package br.com.alura.codechella.repository;

import br.com.alura.codechella.infrastructure.persistence.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
