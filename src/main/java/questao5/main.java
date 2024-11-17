package questao5;

import questao5.classes.Analista;
import questao5.classes.Empresa;
import questao5.classes.Gerente;

public class main {
    public static void main(String[] args) {
        Empresa<Gerente> empresaGerentes = new Empresa<>();
        Empresa<Analista> empresaAnalistas = new Empresa<>();

        Gerente gerente1 = new Gerente(1, "Alice", 10000.0);
        Gerente gerente2 = new Gerente(2, "Bob", 12000.0);

        Analista analista1 = new Analista(3, "Carlos", 5000.0);
        Analista analista2 = new Analista(4, "Diana", 6000.0);

        empresaGerentes.adicionarFuncionario(gerente1);
        empresaGerentes.adicionarFuncionario(gerente2);

        empresaAnalistas.adicionarFuncionario(analista1);
        empresaAnalistas.adicionarFuncionario(analista2);

        System.out.println("Gerentes:");
        empresaGerentes.listarFuncionarios();

        System.out.println("\nAnalistas:");
        empresaAnalistas.listarFuncionarios();
    }
}
