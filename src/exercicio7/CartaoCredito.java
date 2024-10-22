package exercicio7;

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String codigoSeguranca;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.codigoSeguranca = codigoSeguranca;
    }
    @Override
    public void processarPagamento(double valor) {
        if (ValidarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com sucesso no cartão de crédito.");
        } else {
            System.out.println("Falha ao processar o pagamento com cartão de crédito.");
        }
    }
    @Override
    public boolean ValidarPagamento() {
        return numeroCartao.length() == 16 && codigoSeguranca.length() == 3;
    }
}