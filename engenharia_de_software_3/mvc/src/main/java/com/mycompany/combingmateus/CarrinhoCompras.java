package com.mycompany.combingmateus;

import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Produto> itens;
    private double total;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
        total += produto.getPreco();
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
        total -= produto.getPreco();
    }

    public double getTotal() {
        return total;
    }

    public void pagar(PagamentoStrategy pagamentoStrategy) {
        pagamentoStrategy.pagar(total);
    }
}
