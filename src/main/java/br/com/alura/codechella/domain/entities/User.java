package br.com.alura.codechella.domain.entities;

import java.time.LocalDate;

public class User {

    private String cpf;
    private String name;
    private LocalDate dateOfBirth;
    private String email;

    public User(String cpf, String name, LocalDate dateOfBirth, String email) {

        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF with incorrect format!");
        }

        this.cpf = cpf;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
