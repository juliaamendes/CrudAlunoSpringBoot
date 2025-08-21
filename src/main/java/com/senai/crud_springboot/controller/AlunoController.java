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

    //Método para criar um novo produto
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }
    //Método para listar todos os produtos
    @GetMapping
    public List<Aluno> ListarAlunos() {
        return alunoRepository.findAll();
    }

    // Método para buscar um produto por ID
    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable String id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

//    @PutMapping("/{id}")
//    public Aluno updateAluno(@PathVariable String id, @RequestBody Aluno alunoDetalhes) {
//        Aluno product = alunoRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
//
//        product.setNome(alunoDetalhes.getNome());
//        product.setPriceInCents(alunoDetalhes.getPriceInCents());
//
//        return alunoRepository.save(product);
//    }


}
