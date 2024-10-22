package exercicio8;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return salarioBase ;
    }

    @Override
    public double calcularBonus(){
        return salarioBase*0.000001;
    }
}


