package com.senai.crud_springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank(message = "O nome do produto não pode estar vazio")
    private String nome;
    private String CPF;
    private String IdAcesso;
    private String email;
    private String curso;


}
