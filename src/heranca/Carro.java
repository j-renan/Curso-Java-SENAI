
package heranca;


public class Carro extends Veiculo {
    private int qtdPortas;
    private String modeloCambio;
    private CombustivelEnum combustivel;

    public Carro(String descricao, int ano, String cor, int km, boolean zeroKm, boolean freioAbs, float valor, int qtdPortas, String modeloCambio, CombustivelEnum combustivel) {
        super(descricao, ano, cor, km, zeroKm, freioAbs, valor);
        this.qtdPortas = qtdPortas;
        this.modeloCambio = modeloCambio;
        this.combustivel = combustivel;
    }    

    @Override
    public String toString() {
        return super.toString() + "\n" + "Carro{" + "qtdPortas=" + qtdPortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }
    
    
}
