package br.com.alura.codechella.infrastructure.controller;

import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.application.usecases.CreateUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/users")
public class UserController {

    private final CreateUser createUser;

    public UserController(CreateUser createUser) {
        this.createUser = createUser;
    }

    @PostMapping
    public UserDTO registerUser(@RequestBody UserDTO dto) {
        User registered = createUser.registerUser(new User(
                dto.cpf(),
                dto.name(),
                dto.dateOfBirth(),
                dto.email()));
        return new UserDTO(
                registered.getCpf(),
                registered.getName(),
                registered.getDateOfBirth(),
                registered.getEmail());

    }
}
