package br.com.alura.codechella.domain.entities.user;

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

    @Test
    public void shouldCreateUserWithFactory() {
        UserBuilder builder = new UserBuilder();
        User user = builder.withNameCpfAndBirthDate(
                "Johann",
                "000.001.002-03",
                LocalDate.parse("1685-03-31"));

        Assertions.assertEquals("Johann", user.getName());

        user = builder.includeAddress("12345-999", 40, "House");

        Assertions.assertEquals("House", user.getAddress().getComplement());

    }
}
