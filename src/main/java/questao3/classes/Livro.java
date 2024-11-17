package questao3.classes;
import questao3.classes.Publicacao;

public class Livro extends Publicacao{

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Livro: " + this.getTitulo() + " - " + this.getAutor();
    }

}
