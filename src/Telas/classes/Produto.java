
package Telas.classes;


public class Produto {
    private String nome;
    private float preco;
    private float desconto;

    public Produto(float preco, float desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public float calcularValorDoDesconto() {
        return this.preco * this.desconto;
    }
    
    public float calcularPrecoComDesconto() {
        return preco - (this.preco * this.desconto);
    }
    
    public String Mensagem(float valorProduto, float valorDoDesconto, float produtoComDesconto) {
        return  String.format("Valor original do produto R$ %.2f \n" +
                "Valor do desconto R$ %.2f\n" +
                "Valor do produto com desconto R$ %.2f", valorProduto, valorDoDesconto,produtoComDesconto );
    }
}
