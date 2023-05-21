package com.mycompany.combingmateus;

class PagamentoPayPal implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
    }
}
