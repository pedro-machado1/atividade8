package exercicio7;

class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (ValidarPagamento()) {
            System.out.println("Boleto gerado com o valor de R$" + valor + ". Código de barras: " + codigoBarras);
        } else {
            System.out.println("Falha ao gerar o boleto.");
        }
    }

    @Override
    public boolean ValidarPagamento() {
        return codigoBarras.length() == 47;
    }
}