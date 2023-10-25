package locadora;

public class Locadora {
    public static void main(String[] args) {
        Cliente silvio = new Cliente(
                "Silvio Santos");
        
        double valorS = silvio.alugarFilmeSimples(3);
        System.out.println("Silvio: " + valorS);
        
        Cliente luciano = new Cliente(
                "Luciano Santos",
                "luciano@gmail.com");
        double valorL = luciano.alugarFilmeLancamento(3, true);
        System.out.println("Luciano: " + valorL);
        boolean emailL = luciano.validarEmail("luciano@gmail");
        System.out.println("E-mail valido: " + emailL);
    }
}
