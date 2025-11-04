import model.Desenvolver;
import model.Funcionario;
import model.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", "111.222.333-44", 3000);
        Gerente g1 = new Gerente("Mariana", "444.555.666-77", 5000, "Recursos Humanos", 26);
        Desenvolver d1 = new Desenvolver("Rikelmy", "638.914.125-05", 4000, "Java", 980);

        System.out.println("Funcionário: " + f1.getNome() + " / Salário Total: " + f1.calcularSalario());
        System.out.println("Gerente: " + g1.getNome() + " / Salário Total: " + g1.calcularSalario() + " / Departamento: " + g1.getDepartamento());
        System.out.println("Nome: " + d1.getNome() + " / Desenvolvedor: " + d1.calcularSalario() + " / Linguagem Principal: " + d1.getLinguagemPrincipal());

    }
}
