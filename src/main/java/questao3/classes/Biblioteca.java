package questao3.classes;

import java.util.ArrayList;
import java.util.List;

import questao3.classes.Publicacao;

public class Biblioteca<T extends Publicacao> {

    private List<T> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(T publicacao) {
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) {
        publicacoes.remove(publicacao);
    }

    public String listarPublicacoe() {
        StringBuilder retorno = new StringBuilder();
        for (T publicacao : publicacoes) {
            retorno.append(publicacao.obterResumo()).append("\n");
        }
        return retorno.toString();
    }

}
