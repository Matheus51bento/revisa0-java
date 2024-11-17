package questao4.classes;

import questao4.exceptions.SaldoInsuficienteException;
import questao4.exceptions.ValorInvalidoException;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, String numeroConta, String titular) {
        super(saldo, numeroConta, titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido");
        }
        if (valor + 10> getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        setSaldo(getSaldo() - valor - 10);
    }
}
