package exercicio3_4;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    public void calcularBonus(){
        this.salario = this.salario * 1.1;
    }
    @Override
    public void trabalhar(){
        System.out.println("O programador está desenvolvendo as atividades da maisPraTI");
    }
}
