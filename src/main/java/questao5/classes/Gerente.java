package questao5.classes;

public class Gerente extends Funcionario implements Bonus {

    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(10.0);
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual / 100;
    }
}