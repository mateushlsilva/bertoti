import escola.Escola;
import model.ConexaoDAO;
import nota.Aluno;
import nota.Professor;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Professor prof1 = new Professor("Linux");
        ConexaoDAO conne = new ConexaoDAO();

        conne.conectaBd();

        escola.setNota(prof1);
        escola.realizarNota();

    }
}