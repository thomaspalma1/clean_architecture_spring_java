package br.com.alura.codechella.infrastructure.controller;

import br.com.alura.codechella.application.usecases.CreateUser;
import br.com.alura.codechella.application.usecases.ListUsers;
import br.com.alura.codechella.domain.entities.user.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping
@RestController("/users")
public class UserController {

    private final CreateUser createUser;
    private final ListUsers listUsers;

    public UserController(CreateUser createUser, ListUsers listUsers) {
        this.createUser = createUser;
        this.listUsers = listUsers;
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

    @GetMapping
    public List<UserDTO> listUsers() {
        return listUsers
                .getAllUsers()
                .stream()
                .map(user -> new UserDTO(
                        user.getCpf(),
                        user.getName(),
                        user.getDateOfBirth(),
                        user.getEmail())).collect(Collectors.toList());
    }
}
