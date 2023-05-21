package com.mycompany.combingmateus;

import java.util.ArrayList;
import java.util.List;

class Estoque {
    private static Estoque instance;
    private List<Produto> produtos;

    private Estoque() {
        produtos = new ArrayList<>();
    }

    public static Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
