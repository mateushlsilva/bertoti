public class Produto implements Mercado {
    String nome;

    @Override
    public void adicionar() {
        System.out.println("O produto " + nome + " Foi adicionado!");
    }

    public void setNome (String nome){
        this.nome = nome;
    }

}
