public class Main {
    public static void main(String[] args) {
        // Cria uma instância da fachada
        MercadoFacade mercado = new MercadoFacade();

        // Cria uma ação
        Model model = new Model("AAPL", 150.0);

        // Cria um observador
        Observer observer = new Observer() {
            public void precoChanged(Model model) {
                System.out.println("O preço da ação " + model.getSimbolo() + " mudou para " + model.getPreco());
            }
        };

        // Adiciona o observador ao mercado de ações
        mercado.addObserver(observer);

        // Executa a estratégia de copra
        mercado.compraStrategy(model);

        // Atualiza o preço da ação
        mercado.updateMercadoPreco(model, 155.0);

        // Executa a estratégia de venda
        mercado.vendaStrategy(model);

        // Remove o observador do mercado de ações
        mercado.removeObserver(observer);
    }
}