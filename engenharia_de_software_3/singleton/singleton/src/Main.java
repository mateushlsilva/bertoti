public class Main {
    public static void main(String[] args) {

        Singleton sistema1 = Singleton.getInstance("ubuntu");
        Singleton sistema2 = Singleton.getInstance("mint");

        System.out.println(sistema1.sistema);
        System.out.println(sistema2.sistema);

        sistema1.addSistema("popOs");

        System.out.println(sistema1.sistema);
    }
}