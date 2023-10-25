package enumeracao;

public class Produto {
    private String descricao;
    private double valor;
    private String status;

    public Produto(String descricao, double valor, String status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", valor=" + valor + ", status=" + status + '}';
    }

}
