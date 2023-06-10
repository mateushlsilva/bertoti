public class MercadoFacade {
    private MercadoAcoes mercadoAcoes;

    public MercadoFacade() {
        this.mercadoAcoes = new MercadoAcoes();
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

    public void addObserver(Observer observer){
        mercadoAcoes.addObserver(observer);
    }

    public void removeObserver(Observer observer){
        mercadoAcoes.removeObserver(observer);
    }
}
