package br.com.alura.codechella.infrastructure.controller;

import java.time.LocalDate;

public record UserDTO(
        String cpf,
        String name,
        LocalDate dateOfBirth,
        String email) {
}
