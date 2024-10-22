package exercicio8;
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario gerente = new Gerente("Pedro", 1000);
        Funcionario desenvolvedor = new Desenvolvedor("Joana", 1000);
        Funcionario estagiario = new Estagiario("Pedro", 1000);

        empresa.adicionarFuncionario(gerente);
        empresa.adicionarFuncionario(desenvolvedor);
        empresa.adicionarFuncionario(estagiario);

        double folhaPagamento = empresa.calcularFolhaPagamento();
        System.out.println("Folha de pagamento: " + folhaPagamento);

        Funcionario novoDesenvolvedor = new Desenvolvedor(estagiario.nome, estagiario.salarioBase);
        empresa.promoverFuncionario(estagiario, novoDesenvolvedor);

        folhaPagamento = empresa.calcularFolhaPagamento();
        System.out.println("Folha de pagamento após promoção: " + folhaPagamento);
    }
}
