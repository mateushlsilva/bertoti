public class MercadoFacade {
    private MercadoAcoes mercadoAcoes;
    private View view;
    public MercadoFacade() {
        this.mercadoAcoes = new MercadoAcoes();
        this.view = new View();
        mercadoAcoes.addObserver(view.observer);
    }

    public void compraStrategy(Model model) {
        Strategy strategy = new CompraStrategy();
        strategy.execute(model);
    }

    public void vendaStrategy(Model model) {
        Strategy strategy = new VendaStrategy();
        strategy.execute(model);
    }

    public void updateMercadoPreco(Model model, double newPreco) {
        mercadoAcoes.updatePreco(model, newPreco);
    }


}
