package com.senai.crud_springboot.controller;
import com.senai.crud_springboot.model.Aluno;
import com.senai.crud_springboot.model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    //Método para criar um novo aluno
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    //Método para listar todos os alunos
    @GetMapping
    public List<Aluno> ListarAlunos() {
        return alunoRepository.findAll();
    }

    // Método para buscar um aluno por ID
    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable String id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno alunoDetalhes) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        aluno.setNome(alunoDetalhes.getNome());
        aluno.setCPF(alunoDetalhes.getCPF());
        aluno.setIdAcesso(alunoDetalhes.getIdAcesso());
        aluno.setEmail(alunoDetalhes.getEmail());
        aluno.setCurso(alunoDetalhes.getCurso());

        return alunoRepository.save(aluno);
    }
    @DeleteMapping("/{id}")
    public void deletarAluno (@PathVariable String id) {
        alunoRepository.deleteById(id);
    }
}


