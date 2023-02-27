package nota;


import java.util.Scanner;

public class Professor implements Nota {

    public String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public  void digitarNota(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Adicionar nota: ");
        int notaInt = ler.nextInt();
        System.out.println("A nota "+ notaInt +" foi adicionada com sucesso!");
    }
    public boolean nota(){
        digitarNota();
        return true;
    }

    public void procuraAluno(){

    }

}
