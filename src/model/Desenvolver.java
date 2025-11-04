package model;

public class Desenvolver extends Funcionario {
    private String linguagemPrincipal;
    private double bonus;

    public Desenvolver(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonus) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonus = bonus;
    }

    public double calcularSalario(){
        return getSalarioBase() + bonus;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
}
