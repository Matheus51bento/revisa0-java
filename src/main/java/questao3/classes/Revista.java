package questao3.classes;

import questao3.classes.Publicacao;

public class Revista extends Publicacao {

    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Revista: " + this.getTitulo() + " - " + this.getAnoPublicacao();
    }
}
