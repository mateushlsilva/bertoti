import java.util.LinkedList;

public final class Singleton {
    private static Singleton linux;

    public LinkedList<String> sistema = new LinkedList<>();

    private Singleton(String value) {
        sistema.add(value);
    }
    public static Singleton getInstance(String versao) {
        if (linux == null) {
            linux = new Singleton(versao);
        }
        return linux;
    }
    public void addSistema(String versao) {
        sistema.add(versao);
    }
}
