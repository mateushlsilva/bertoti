public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Leite");
        Produto produto1 = new Produto();
        produto1.setNome("Suco de Uva");
        Produto produto2 = new Produto();
        produto2.setNome("Água com Gás");

        Prateleira colocar = new Prateleira();
        colocar.add(produto);
        colocar.add(produto1);
        colocar.add(produto2);
        colocar.adicionar();
    }
}