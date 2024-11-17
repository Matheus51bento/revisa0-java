package questao2.classes;

import questao2.classes.Pagamento;

public class PagamentoPix implements Pagamento{

    @Override
    public boolean processarPagamento() {
        System.out.println("Pagamento via Pix processado com sucesso!");
        return true;
    }

}
