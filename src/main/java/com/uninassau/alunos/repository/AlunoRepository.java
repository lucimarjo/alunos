package com.uninassau.alunos.repository;

import com.uninassau.alunos.service.Aluno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepository {

    private List<Aluno> alunos = new ArrayList<>();

    public Aluno salvar(Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    public List<Aluno> listar() {
        return alunos;
    }

    public Aluno buscarPorId(long id) {
        return alunos.stream()
                .filter(aluno -> aluno.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean remover(long id) {
        return alunos.removeIf(aluno -> aluno.getId() == id);
    }
}