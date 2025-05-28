package br.com.alura.codechella.repository;

import br.com.alura.codechella.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
