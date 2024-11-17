package questao4;

import questao4.classes.Conta;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(1000.0, "1234-5", "Fulano");

        try {
            conta.sacar(10000.0);
            System.out.println("Saldo: " + conta.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
