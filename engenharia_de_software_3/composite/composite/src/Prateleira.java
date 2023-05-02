import java.util.LinkedList;

public class Prateleira implements Mercado {
    LinkedList<Mercado> mercado = new LinkedList<>();

    @Override
    public void adicionar() {
        for (Mercado merc : mercado) {
            merc.adicionar();
        }
    }
    public void add(Mercado prod){
        mercado.add(prod);
    }
}
