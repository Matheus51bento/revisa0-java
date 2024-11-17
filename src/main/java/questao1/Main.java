package questao1;

import questao1.classes.Aluno;
import questao1.classes.Curso;
import questao1.classes.Professor;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = List.of(
            new Aluno(1, "Aluno 1"),
            new Aluno(2, "Aluno 2"),
            new Aluno(3, "Aluno 3")
        );

        List<Curso> cursos = List.of(
            new Curso(1, "Curso 1", 240),
            new Curso(2, "Curso 2", 230),
            new Curso(3, "Curso 3", 120)
        );

        List<Professor> professores = List.of(
            new Professor(1, "Professor 1"),
            new Professor(2, "Professor 2"),
            new Professor(3, "Professor 3")
        );

        // Criação de cursos
        Curso curso1 = new Curso(1, "Curso 1", 240);
        Curso curso2 = new Curso(2, "Curso 2", 230);
        Curso curso3 = new Curso(3, "Curso 3", 120);

        // Criação de professores
        Professor professor1 = new Professor(1, "Professor 1");
        Professor professor2 = new Professor(2, "Professor 2");
        Professor professor3 = new Professor(3, "Professor 3");

        // Criação de alunos
        Aluno aluno1 = new Aluno(1, "Aluno 1");
        Aluno aluno2 = new Aluno(2, "Aluno 2");
        Aluno aluno3 = new Aluno(3, "Aluno 3");

        // Adicionando cursos aos alunos
        aluno1.matricular(curso1);
        aluno1.matricular(curso2);
        aluno2.matricular(curso1);
        aluno3.matricular(curso3);

        // Adicionando professores aos cursos
        professor1.associar(curso1);
        professor2.associar(curso2);
        professor3.associar(curso3);
        professor3.associar(curso1);

        // Exibindo alunos por curso
        System.out.println("Alunos do curso 1:");
        exibirAlunosPorCurso(List.of(aluno1, aluno2, aluno3), curso1);

        System.out.println("Alunos do curso 2:");
        exibirAlunosPorCurso(List.of(aluno1, aluno2, aluno3), curso2);

        System.out.println("Alunos do curso 3:");
        exibirAlunosPorCurso(List.of(aluno1, aluno2, aluno3), curso3);

    }

    public static void exibirAlunosPorCurso(List<Aluno> alunos, Curso curso) {

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).hasCurso(curso.getId())) {
                System.out.println(alunos.get(i).getNome());
            }
        }

    }
}