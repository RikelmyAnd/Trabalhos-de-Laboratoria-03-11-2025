package model;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonificacao;


    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacao) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacao = bonificacao;
    }

    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * (bonificacao / 100));
    }

    public String getDepartamento() {
        return departamento;
    }
}
