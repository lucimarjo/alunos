package com.uninassau.alunos.service;

import com.uninassau.alunos.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listarTodos() {
        return repository.listar();
    }

    public Aluno buscarPorId(long id) {
        return repository.buscarPorId(id);
    }

    public Aluno criar(Aluno aluno) {
        return repository.salvar(aluno);
    }

    public Aluno atualizar(long id, Aluno alunoAtualizado) {

        Aluno aluno = repository.buscarPorId(id);

        if (aluno == null) {
            return null;
        }

        aluno.setNome(alunoAtualizado.getNome());
        aluno.setCurso(alunoAtualizado.getCurso());

        return aluno;
    }

    public boolean deletar(long id) {
        return repository.remover(id);
    }
}