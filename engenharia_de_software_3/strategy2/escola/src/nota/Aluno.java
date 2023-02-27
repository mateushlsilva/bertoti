package nota;

public class Aluno implements Nota {

    public String nome;
    public int notaFinal;


    public Aluno(String nome, int notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean nota(){
        naoTemPermissao();
        return false;
    }
    public void naoTemPermissao(){
        System.out.println("Não tem permissão de envio de nota!");
    }
}
