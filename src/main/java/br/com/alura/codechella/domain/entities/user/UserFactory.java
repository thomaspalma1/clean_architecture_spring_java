package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class UserFactory {

    private User user;

    public User withNameCpfAndBirthDate(
            String name,
            String cpf,
            LocalDate dateOfBirth) {
        this.user = new User(cpf, name, dateOfBirth, "");
        return this.user;
    }

    private User includeAddress(
            String zipCode,
            Integer number,
            String complement) {
        this.user.setAddress(new Address(
                zipCode,
                number,
                complement));
        return this.user;
    }
}
