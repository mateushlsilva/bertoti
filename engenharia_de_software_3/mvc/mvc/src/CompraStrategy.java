public class CompraStrategy implements Strategy{
    public void execute(Model model) {
        // Lógica para comprar ações
        System.out.println("Comprando ações de " + model.getSimbolo() + " por " + model.getPreco());
    }
}
