public class Main {
    public static void main(String[] args) {
        Canonical mateus = new Canonical();
        Canonical linux = new Canonical();

        mateus.event.subscribe(new LancamentoServer());
        linux.event.subscribe(new LancamentoDesktop());


        mateus.newEdition2("World War Hulk");
        linux.newEdition1("Batman the Dark Knight");
    }
}