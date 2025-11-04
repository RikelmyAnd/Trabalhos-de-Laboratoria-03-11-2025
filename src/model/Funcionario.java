package model;

public class Funcionario{
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
