package heranca.escola;


public class Escola {
    public static void main(String[] args) {
        Aluno calabreso = new Aluno("Calabreso Assado", 25, "calabreso@gmail.com", "a254fghfh86", true);
        System.out.println(calabreso + "\n");
        
        Professor girafales = new Professor("Girafales", 55, "girafales@gmail.com", true, AreaAtuacaoEnum.METAL_MECANICA, AreaAtuacaoEnum.METAL_MECANICA);
        System.out.println(girafales);
               
    }
}
