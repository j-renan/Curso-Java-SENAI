
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
        
}
