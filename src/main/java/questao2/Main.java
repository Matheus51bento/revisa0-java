package questao2;

import questao2.classes.Eletronico;
import questao2.classes.PagamentoPix;
import questao2.classes.Vestuario;
import questao2.classes.PagamentoCartao;

public class Main {

    public static void main(String[] args) {

        Eletronico eletronico = new Eletronico(1, "Smartphone", 1000.0);
        Vestuario vestuario = new Vestuario(2, "Camisa", 50.0);

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        PagamentoPix pagamentoPix = new PagamentoPix();

        System.out.println("Eletronico: " + eletronico.cacularDesconto());
        System.out.println("Vestuario: " + vestuario.cacularDesconto());

        System.out.println("Pagamento Cartão: " + pagamentoCartao.processarPagamento());
        System.out.println("Pagamento Pix: " + pagamentoPix.processarPagamento());

    }

}
