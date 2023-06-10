public class VendaStrategy implements Strategy{
    public void execute(Model model) {
        System.out.println("Vendendo ações de " + model.getSimbolo() + " por " + model.getPreco());
    }
}
