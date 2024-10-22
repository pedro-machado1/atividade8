package exercicio3_4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 3500);
        Gerente gerente = new Gerente("Maria", 2500);
        funcionario.trabalhar();
        gerente.trabalhar();
    }
}
