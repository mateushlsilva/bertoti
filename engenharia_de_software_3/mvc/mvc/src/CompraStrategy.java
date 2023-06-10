public class CompraStrategy implements Strategy{
    public void execute(Model model) {
        System.out.println("Comprando ações de " + model.getSimbolo() + " por " + model.getPreco());
    }
}
