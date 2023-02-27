import escola.Escola;
import nota.Aluno;
import nota.Professor;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Professor prof1 = new Professor("Linux");


        escola.setNota(prof1);
        escola.realizarNota();

    }
}