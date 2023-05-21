package com.mycompany.combingmateus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class LojaRoupasView {
    private JFrame frame;
    private JTextArea produtosTextArea;
    private JButton exibirProdutosButton;
    private JComboBox<String> produtosComboBox;
    private JButton comprarButton;
    private LojaRoupas loja;

    public LojaRoupasView(LojaRoupas loja) {
        this.loja = loja;

        // Configurar a janela principal
        frame = new JFrame("Loja de Roupas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Configurar a área de exibição dos produtos
        produtosTextArea = new JTextArea();
        produtosTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(produtosTextArea);

        // Configurar o botão para exibir produtos
        exibirProdutosButton = new JButton("Exibir Produtos");
        exibirProdutosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirProdutos();
            }
        });

        // Configurar o combobox para selecionar produtos
        produtosComboBox = new JComboBox<>();
        produtosComboBox.setEnabled(false);

        // Configurar o botão para comprar
        comprarButton = new JButton("Comprar");
        comprarButton.setEnabled(false);
        comprarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprarProduto();
            }
        });

        // Adicionar a área de exibição dos produtos, o botão de exibir, o combobox e o botão de comprar à janela principal
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(exibirProdutosButton);
        panel.add(produtosComboBox);
        panel.add(comprarButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        // Exibir a janela principal
        frame.setVisible(true);
    }

    private void exibirProdutos() {
        List<Produto> produtos = loja.getProdutos();
        StringBuilder produtosTexto = new StringBuilder("Produtos disponíveis:\n");
        for (Produto produto : produtos) {
            produtosTexto.append(produto.getNome()).append(" - R$").append(produto.getPreco()).append("\n");
        }
        produtosTextArea.setText(produtosTexto.toString());

        produtosComboBox.removeAllItems();
        for (Produto produto : produtos) {
            produtosComboBox.addItem(produto.getNome());
        }
        produtosComboBox.setEnabled(true);
        comprarButton.setEnabled(true);
    }

    private void comprarProduto() {
        String produtoSelecionado = (String) produtosComboBox.getSelectedItem();
        Produto produto = loja.removerProduto(produtoSelecionado);
        if (produto != null) {
            JOptionPane.showMessageDialog(frame, "Produto '" + produto.getNome() + "' comprado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(frame, "Erro ao comprar o produto.");
        }

        exibirProdutos();
    }

}