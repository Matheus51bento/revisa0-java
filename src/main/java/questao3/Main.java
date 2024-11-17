package questao3;

import questao3.classes.Biblioteca;
import questao3.classes.Livro;
import questao3.classes.Publicacao;
import questao3.classes.Revista;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Livro 1", "Autor 1", 2020);
        Livro livro2 = new Livro("Livro 2", "Autor 2", 2021);

        Revista revista1 = new Revista("Revista 1", "Autor 3", 2022, 1);

        Biblioteca<Publicacao> bibliotecaLivro = new Biblioteca<>();

        bibliotecaLivro.adicionarPublicacao(livro1);
        bibliotecaLivro.adicionarPublicacao(livro2);
        bibliotecaLivro.adicionarPublicacao(revista1);

        System.out.println(bibliotecaLivro.listarPublicacoe());

    }

}
