
package heranca;

public class Estacionamento {
    public static void main(String[] args) {
        Carro fiat147 = new Carro("Fiat 147", 1982, "Azul Calcinha", 152000, false, false, 22000, 2, "Cambio manual", CombustivelEnum.GASOLINA);
        System.out.println(fiat147 + "\n");
        
        Moto CB450 = new Moto("CB 450 só o bagaço", 1995, "Vermelha", 92000, false, false, 1500, CombustivelEnum.GASOLINA, TipoPartidaEnum.PARTIDA_PEDAL);
        System.out.println(CB450 + "\n");
        
        Scooter tesla = new Scooter("Scooter elétrica Tesla", 2023, "Preta", 0, true, true, 15000, 5500);
        System.out.println(tesla);
    }
}
