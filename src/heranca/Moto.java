
package heranca;


public class Moto extends Veiculo {
    private CombustivelEnum combustivel;
    private String tipoPartda;

    public Moto(String descricao, int ano, String cor, int km, boolean zeroKm, boolean freioAbs, float valor, CombustivelEnum combustivel, TipoPartidaEnum tipoPartda) {
        super(descricao, ano, cor, km, zeroKm, freioAbs, valor);
        this.combustivel = combustivel;
        this.tipoPartda = tipoPartda.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Moto{" + "combustivel=" + combustivel + ", tipoPartda=" + tipoPartda + '}';
    }
    
    
}
