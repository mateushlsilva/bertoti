package com.mycompany.combingmateus;

public class Main {
    public static void main(String[] args) {
        // Criando a loja
        LojaRoupas loja = new LojaRoupas("Minha Loja");

        // Criando produtos
        Produto camiseta = new Produto("Camiseta", 39.90);
        Produto calcaJeans = new Produto("Calça Jeans", 99.90);

        // Adicionando produtos ao estoque
        Estoque estoque = Estoque.getInstance();
        estoque.adicionarProduto(camiseta);
        estoque.adicionarProduto(calcaJeans);

        // Criando clientes
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        // Adicionando clientes à lista de observadores da loja
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        // Exibindo produtos disponíveis na loja
        loja.exibirProdutos();

        // Adicionando produtos ao carrinho de compras
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem(camiseta);
        carrinho.adicionarItem(calcaJeans);

        // Realizando o pagamento com cartão de crédito
        PagamentoStrategy pagamentoCartao = new PagamentoCartao();
        carrinho.pagar(pagamentoCartao);

        // Removendo um produto do carrinho
        carrinho.removerItem(camiseta);

        // Realizando o pagamento com PayPal
        PagamentoStrategy pagamentoPayPal = new PagamentoPayPal();
        carrinho.pagar(pagamentoPayPal);

        // Notificando os clientes sobre a finalização da compra
        loja.notificarClientes("Compra realizada com sucesso!");

        // Removendo cliente da lista de observadores da loja
        loja.removerCliente(cliente2);
        
        LojaRoupasApp.main(args);
    }
}