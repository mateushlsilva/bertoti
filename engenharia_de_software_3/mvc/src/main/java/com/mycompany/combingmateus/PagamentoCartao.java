package com.mycompany.combingmateus;

class PagamentoCartao implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}
