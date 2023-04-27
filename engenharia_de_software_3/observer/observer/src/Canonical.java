public class Canonical{
    public Repositorio event;

    public  Canonical() {
        event = new Repositorio();
    }

    public void newEdition1(String message) {
        event.notify(new LancamentoDesktop(), message);
    }

    public void newEdition2(String message) {
        event.notify(new LancamentoServer(), message);
    }
}
