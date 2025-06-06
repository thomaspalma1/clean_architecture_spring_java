package br.com.alura.codechella.controller;

import br.com.alura.codechella.infrastructure.persistence.UserEntity;
import br.com.alura.codechella.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @Transactional
    public ResponseEntity register(@RequestBody @Valid UserEntity user,
                                   UriComponentsBuilder uriBuilder) {
        service.registerUser(user);
        var uri = uriBuilder
                .path("/users/{id}")
                .buildAndExpand(user.getId()).toUri();

        return ResponseEntity
                .created(uri)
                .body(user);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> list() {
        return ResponseEntity.ok(service.listAll());
    }

}
