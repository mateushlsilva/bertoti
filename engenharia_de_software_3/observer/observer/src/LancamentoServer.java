public class LancamentoServer implements Observer {
    public LancamentoServer() {
    }
    public void update(String message) {
        System.out.println(message + " |> Previsão de Lançamento 25/04/2023");
    }
}
