package exercicio1_2;

public class Main {
    public static void main(String[] args) {
        exercicio2 produto = new exercicio2("Luis", 250, 20);
        produto.aplicarDesconto(35);
        System.out.println(produto.getNome() +" " +produto.getPreco()+ " " + produto.getQuantidade());

    }
}
