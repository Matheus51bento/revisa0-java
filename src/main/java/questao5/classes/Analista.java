package questao5.classes;

public class Analista extends Funcionario implements Bonus {

    public Analista(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonus(5.0);
    }

    @Override
    public double calcularBonus(double percentual) {
        return salarioBase * percentual / 100;
    }
}