public class Main {
    public static void main(String[] args) {
        Canonical mateus = new Canonical();
        Canonical linux = new Canonical();

        mateus.event.subscribe(new LancamentoServer());
        linux.event.subscribe(new LancamentoDesktop());


        mateus.newEdition2("Ubuntu 22.04 LTS");
        linux.newEdition1("Debian 10");
    }
}
