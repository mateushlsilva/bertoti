import java.util.ArrayList;
import java.util.Scanner;
public class View {
    Observer observer = new Observer() {
        public void precoChanged(Model model) {
            System.out.println("================================================================================");
            System.out.println("O preço da ação " + model.getSimbolo() + " mudou para " + model.getPreco());
            System.out.println("================================================================================");
        }
    };

    public void menu(ArrayList<Model> models){
        int opc;
        Scanner scanner = new Scanner(System.in);
        MercadoFacade mercado = new MercadoFacade();
        boolean roda = true;
        while (roda){
            System.out.println("------------ Menu ------------------------");
            System.out.println("[ 1 ] - Comprar Ações");
            System.out.println("[ 2 ] - Vender Ações");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------------------------");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    comprar(models);
                    break;
                case 2:
                    vender(models);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    roda = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public void comprar(ArrayList<Model> models){
        int opc;
        boolean roda = true;
        Scanner scanner = new Scanner(System.in);
        MercadoFacade mercado = new MercadoFacade();

        while (roda){
            System.out.println("------------ Menu ------------------------");
            System.out.println("[ 1 ] - AAPL");
            System.out.println("[ 2 ] - CCBD");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------------------------");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    mercado.compraStrategy(models.get(0));
                    break;
                case 2:
                    mercado.compraStrategy(models.get(1));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    roda = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        mercado.updateMercadoPreco(models.get(0), 155.0);
    }

    public void vender(ArrayList<Model> models){
        int opc;
        boolean roda = true;
        Scanner scanner = new Scanner(System.in);
        MercadoFacade mercado = new MercadoFacade();

        while (roda){
            System.out.println("------------ Menu ------------------------");
            System.out.println("[ 1 ] - AAPL");
            System.out.println("[ 2 ] - CCBD");
            System.out.println("[ 0 ] - Sair");
            System.out.println("------------------------------------------");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    mercado.vendaStrategy(models.get(0));
                    break;
                case 2:
                    mercado.vendaStrategy(models.get(1));
                    break;
                case 0:
                    System.out.println("Saindo...");
                    roda = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        mercado.updateMercadoPreco(models.get(1), 170.0);
    }

}
