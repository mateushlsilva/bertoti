public class Model {
    private String simbolo;
    private double preco;

    public Model(String simbolo, double preco) {
        this.simbolo = simbolo;
        this.preco = preco;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
