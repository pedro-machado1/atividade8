package exercicio1_2;

public class exercicio2 extends Produto {
    public exercicio2(String nome, double preco , int quantidade) {
        super(nome, preco, quantidade);
    }
    public void aplicarDesconto(double desconto) {
        if (0>desconto || desconto > 50.0) {
            throw new RuntimeException("Desconto invalido, o valor deve ser menor do que 50 e maior do que 0");
        }
        double resultado=this.getPreco()*desconto / 100;
        this.setPreco(resultado);
    }

}
