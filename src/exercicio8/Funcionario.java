package exercicio8;

public abstract class Funcionario {
    protected double salarioBase;
    protected String nome;
    public Funcionario(String nome, double salarioBase) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }
    public abstract double calcularSalario();
    public abstract double calcularBonus();

}
