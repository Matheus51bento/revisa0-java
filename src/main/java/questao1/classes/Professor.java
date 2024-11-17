package questao1.classes;

import java.util.ArrayList;

public class Professor {
    private int id;
    private String nome;
    private ArrayList<Curso> cursos;

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void associar(Curso curso) {
        this.cursos.add(curso);
    }

    public void returnCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }
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
}
