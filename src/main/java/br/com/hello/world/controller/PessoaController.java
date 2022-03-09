package br.com.hello.world.controller;

import br.com.hello.world.entity.PessoaEntity;
import br.com.hello.world.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoas")
    public List<PessoaEntity> listarPessoa(){
        return pessoaRepository.findAll();
    }

    @PostMapping("/pessoa")
    public PessoaEntity salvarPessoa(@RequestBody PessoaEntity pessoaEntity){

        return pessoaRepository.save(pessoaEntity);
    }
}
