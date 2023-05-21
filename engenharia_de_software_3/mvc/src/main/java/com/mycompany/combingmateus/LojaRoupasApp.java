package com.mycompany.combingmateus;
import javax.swing.SwingUtilities;

public class LojaRoupasApp {
    public static void main(String[] args) {
        LojaRoupas loja = new LojaRoupas("Minha Loja");
        Produto camiseta = new Produto("Camiseta", 39.90);
        Produto calcaJeans = new Produto("Calça Jeans", 99.90);
        loja.adicionarProduto(camiseta);
        loja.adicionarProduto(calcaJeans);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LojaRoupasView(loja);
            }
        });
    }
}
