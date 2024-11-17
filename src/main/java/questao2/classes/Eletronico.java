package questao2.classes;

import questao2.classes.Produto;

public class Eletronico extends Produto{

    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double cacularDesconto() {
        return this.getPreco() * 0.9;
    }
}
