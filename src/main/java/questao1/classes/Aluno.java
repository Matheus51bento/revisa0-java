package questao1.classes;

import java.util.ArrayList;

public class Aluno {
    private int id;
    private String nome;
    private ArrayList<Curso> cursos;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public boolean hasCurso(int id) {
        for (Curso curso : cursos) {
            if (curso.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void matricular(Curso curso) {
        this.cursos.add(curso);
    }

}
