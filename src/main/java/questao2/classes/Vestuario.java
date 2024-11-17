package questao2.classes;

import questao2.classes.Produto;

public class Vestuario extends Produto{

    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double cacularDesconto() {
        return this.getPreco() * 0.8;
    }
}
