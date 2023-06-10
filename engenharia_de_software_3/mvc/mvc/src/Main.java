public class Main {
    public static void main(String[] args) {
        // Cria uma instância da fachada
        MercadoFacade mercado = new MercadoFacade();

        // Cria uma ação
        Model model = new Model("AAPL", 150.0);

        // Executa a estratégia de copra
        mercado.compraStrategy(model);

        // Atualiza o preço da ação
        mercado.updateMercadoPreco(model, 155.0);

        // Executa a estratégia de venda
        mercado.vendaStrategy(model);


    }
}