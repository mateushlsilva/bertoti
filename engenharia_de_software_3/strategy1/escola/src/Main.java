import escola.Escola;
import nota.Aluno;
import nota.Professor;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        escola.setNota(new Professor());
        escola.realizarNota();

    }
}