public class Aluno {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void entrar(){
        System.out.println(nome.toString() + " entrou na escola!");
    }

    public  void sair(){
        System.out.println(nome.toString() + " saiu da escola!");
    }
}
