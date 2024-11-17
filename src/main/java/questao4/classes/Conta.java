package questao4.classes;

import questao4.classes.Transacao;

public class Conta extends Transacao {
    private String numeroConta;
    private String titular;

    public Conta(double saldo, String numeroConta, String titular) {
        super(saldo);
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
