package questao2.classes;

import questao2.classes.Pagamento;

public class PagamentoCartao implements Pagamento{

    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento via Cartão processado com sucesso!");
        return true;
    }

}
