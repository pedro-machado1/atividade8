package exercicio7;

class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (ValidarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " realizado via Pix com sucesso. Chave: " + chavePix);
        } else {
            System.out.println("Falha ao realizar pagamento via Pix.");
        }
    }

    @Override
    public boolean ValidarPagamento() {
        // Validação básica para simular chave Pix (pode ser CPF, e-mail, etc.)
        return chavePix != null && !chavePix.isEmpty();
    }
}
