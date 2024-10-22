package exercicio3_4;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public void calcularBonus(){
        this.salario = this.salario * 1.2;
    }
    @Override
    public void trabalhar(){
        System.out.println("O gerente está gerenciando os seus programadors");
    }
}
