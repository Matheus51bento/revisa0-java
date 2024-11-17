package questao4.classes;

import questao4.exceptions.SaldoInsuficienteException;
import questao4.exceptions.ValorInvalidoException;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, String numeroConta, String titular) {
        super(saldo, numeroConta, titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido");
        }
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        if (valor > 3000) {
            throw new ValorInvalidoException("Valor inválido");
        }
        setSaldo(getSaldo() - valor);
    }
}
