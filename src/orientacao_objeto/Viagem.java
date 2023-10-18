
package orientacao_objeto;

import java.util.Date;

public class Viagem {
    private String destino;
    private float preco;
    private float distancia;
    private Date dataIda;
    private Date dataVolta;

    public Viagem() {
    }

    public Viagem(String destino, float preco, float distancia, Date dataIda, Date dataVolta) {
        this.destino = destino;
        this.preco = preco;
        this.distancia = distancia;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }    

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }
    
    
        
}
