package com.mycompany.combingmateus;

import java.util.ArrayList;
import java.util.List;


class LojaRoupas {
    private String nome;
    private List<Produto> produtos;
    private List<Observer> clientes;

    public LojaRoupas(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto removerProduto(String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                produtos.remove(produto);
                return produto;
            }
        }
        return null; // Produto não encontrado
    }

    public void adicionarCliente(Observer cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Observer cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes(String mensagem) {
        for (Observer cliente : clientes) {
            cliente.notificar(mensagem);
        }
    }

    public void exibirProdutos() {
        System.out.println("Produtos disponíveis na loja " + nome + ":");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }
}
