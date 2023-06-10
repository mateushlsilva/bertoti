public class View {
    Observer observer = new Observer() {
        public void precoChanged(Model model) {
            System.out.println("O preço da ação " + model.getSimbolo() + " mudou para " + model.getPreco());
        }
    };

}
