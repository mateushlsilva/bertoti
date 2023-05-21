package com.mycompany.combingmateus;

class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void notificar(String mensagem) {
        System.out.println("Cliente " + nome + ": " + mensagem);
    }
}
