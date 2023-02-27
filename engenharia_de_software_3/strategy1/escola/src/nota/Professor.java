package nota;


import java.util.Scanner;

public class Professor implements Nota {
    public void nota(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Adicionar nota: ");
        int notaInt = ler.nextInt();
        System.out.println("A nota "+ notaInt +" foi adicionada com sucesso!");
    }

}
