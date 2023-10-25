
package heranca;

public class Scooter extends Veiculo {
    private float potenciaBateria;

    public Scooter(String descricao, int ano, String cor, int km, boolean zeroKm, boolean freioAbs, float valor, float potenciaBateria) {
        super(descricao, ano, cor, km, zeroKm, freioAbs, valor);
        this.potenciaBateria = potenciaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" + "potenciaBateria=" + potenciaBateria + '}';
    }
    
    
}





