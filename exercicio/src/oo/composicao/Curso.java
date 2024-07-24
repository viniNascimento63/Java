package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;

    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso " + nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
