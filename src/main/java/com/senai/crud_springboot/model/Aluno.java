package com.senai.crud_springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank(message = "O nome do produto não pode estar vazio")
    @Column(nullable = false, length = 100)
    private String nome;
    @NotBlank(message = "O CPF não pode estar vazio")
    @Column(nullable = false, length = 11)
    private String CPF;

    private String IdAcesso;
    @NotBlank(message = "O email não pode estar vazio")
    @Column(nullable = false, length = 60)
    private String email;
    private String curso;


    public Aluno(String id, String nome, String CPF, String idAcesso, String email, String curso) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        IdAcesso = idAcesso;
        this.email = email;
        this.curso = curso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdAcesso() {
        return IdAcesso;
    }

    public void setIdAcesso(String idAcesso) {
        IdAcesso = idAcesso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}