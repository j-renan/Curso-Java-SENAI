
package listas;

public class Carro {
    private String modelo;
    private String cor;
    private String marca;
    private int ano;

    public Carro(String modelo, String cor, String marca, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carros{" + "modelo=" + modelo + ", cor=" + cor + ", marca=" + marca + ", ano=" + ano + '}';
    }    
    
}
