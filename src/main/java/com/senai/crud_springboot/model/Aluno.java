package com.senai.crud_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nome;
    private int CPF;
    private String IdAcesso;
    private String email;
    private String curso;

    public Aluno(String id, String nome, int CPF, String idAcesso, String email, String curso) {
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
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
