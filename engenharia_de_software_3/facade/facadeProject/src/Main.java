import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Aluno> aluno = new LinkedList<>();
        Escola escola = new Escola();

        Aluno mateus = new Aluno();

        mateus.setNome("mateus");

        aluno.add(mateus);

        Facade facade = new Facade();

        facade.abrirPortao(aluno, escola);

        facade.fecharPortao(aluno, escola);
    }
}