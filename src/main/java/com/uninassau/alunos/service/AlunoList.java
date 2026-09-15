package com.uninassau.alunos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AlunoList {

    private final List<Aluno> alunos = 
        new ArrayList<>();
    private long proximoId = 1L;

    public List<Aluno> listar(){
        return alunos;
    }
}
