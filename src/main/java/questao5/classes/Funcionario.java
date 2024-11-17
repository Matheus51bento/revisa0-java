package questao5.classes;

public abstract class Funcionario {
    private int id;
    private String nome;
    protected double salarioBase;

    public Funcionario(int id, String nome, double salarioBase) {
        this.id = id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário Final: R$ " + String.format("%.2f", calcularSalario());
    }
}
