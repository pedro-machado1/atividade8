package exercicio7;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartaoCredito = new CartaoCredito("1234567812345678", "João Silva", "12/25", "123");
        FormaPagamento boleto = new Boleto("98765478901234567890123456789012345678901234567");
        FormaPagamento pix = new Pix("joao@example.com");

        cartaoCredito.processarPagamento(250.75);

        boleto.processarPagamento(150.00);

        pix.processarPagamento(89.99);
    }
}

