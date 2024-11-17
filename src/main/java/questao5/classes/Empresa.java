package questao5.classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa<T extends Funcionario> {
    private List<T> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        funcionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (T funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
