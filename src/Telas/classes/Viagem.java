
package Telas.classes;

public class Viagem {
    private final float PRECO_GASOLINA = 5.39f;
    private final float PRECO_ETANOL = 3.49f;
    
    private String veiculo;
    private short distancia;
    private byte mediaConsumoGasolina;
    private byte mediaConsumoEtanol;

    public Viagem(String veiculo, short distancia, byte mediaConsumoGasolina, byte mediaConsumoEtanol) {
        this.veiculo = veiculo;
        this.distancia = distancia;
        this.mediaConsumoGasolina = mediaConsumoGasolina;
        this.mediaConsumoEtanol = mediaConsumoEtanol;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public short getDistancia() {
        return distancia;
    }

    public byte getMediaConsumoGasolina() {
        return mediaConsumoGasolina;
    }

    public byte getMediaConsumoEtanol() {
        return mediaConsumoEtanol;
    }
    
    public float calcularCustoComGasolina() {
        return (this.distancia / this.mediaConsumoGasolina) * PRECO_GASOLINA;
    }
    
    public float calcularCustoComEtanol() {
        return (this.distancia / this.mediaConsumoEtanol) * PRECO_ETANOL;
    }
    
    public int calcularQtdeLitrosGasolina() {
        return this.distancia / this.mediaConsumoGasolina;
    }
    
    public int calcularQtdeLitrosEtanol() {
        return this.distancia / this.mediaConsumoEtanol;
    }
    
    public String verificarCombustivelMaisVantajoso(
            float totalViagemComGasolina, float totalViagemComAlcool
    ) {
        String maisVantajoso = totalViagemComGasolina < totalViagemComAlcool ? "Mais vantajoso viajar com Gasolina" : "Mais vantajoso viajar com Etanol";
        return maisVantajoso;
    }
    
}
