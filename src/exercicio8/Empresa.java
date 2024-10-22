package exercicio8;
import java.util.LinkedList;
import java.util.List;

class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new LinkedList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void promoverFuncionario(Funcionario funcionario, Funcionario novoCargo) {
        funcionarios.remove(funcionario);
        funcionarios.add(novoCargo);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario fun : funcionarios) {
            total += fun.calcularSalario() + fun.calcularBonus();
        }
        return total;
    }
}
