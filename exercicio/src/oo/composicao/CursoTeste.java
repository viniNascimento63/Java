package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("André");
        Aluno aluno2 = new Aluno("Paulo");
        Aluno aluno3 = new Aluno("Tadeu");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("PHP 8");
        Curso curso3 = new Curso("React");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso3.alunos) {
            System.out.println("Estou matriculado(a) no curso " + curso3.nome + "...");
            System.out.println("...e o meu nome é " + aluno);
            System.out.println();
        }

        System.out.println(aluno1 + ": " + aluno1.cursos);

        Curso cursoEncontrado = aluno2.obterCursoPorNome("java completo");
        if (cursoEncontrado != null) {
            System.out.println("\n" + cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
