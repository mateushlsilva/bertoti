import java.util.LinkedList;

public class Facade {
    public void abrirPortao(LinkedList<Aluno> aluno, Escola escola) {
        escola.abrir();
        aluno.forEach(a -> a.entrar());
    }
    public void fecharPortao(LinkedList<Aluno> aluno, Escola escola) {
        escola.fechar();
        aluno.forEach(a -> a.sair());
    }
}
