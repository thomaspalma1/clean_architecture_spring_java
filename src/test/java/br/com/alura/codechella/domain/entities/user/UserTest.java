package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {

    @Test
    public void shouldNotRegisterUserWithInvalidCpfFormat() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User(
                        "123456789-99",
                        "Dave",
                        LocalDate.parse("1990-09-08"),
                        "email@email.com"));
    }
}
