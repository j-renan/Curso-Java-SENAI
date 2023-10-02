/**
 * 
Crie o arquivo Viagem.java solicitando as informações abaixo via Scanner:
veículo
distância percorrida
média km gasolina
média km etanol
- Considere o valor para gasolina 5.39 e etanol 3.49;
1) Calcule a quantidade de litros necessária para percorrer a distância para gasolina e etanol;
2) Calcule o total gasto para gasolina e etanol;
3) Mostre uma mensagem ao final com as informações;
 */



package aulas;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Viagem {
    
    
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        double PRECO_GASOLINA = 5.39;
        double PRECO_ALCOOL = 3.49;
        
        System.out.println("Qual o modelo do seu veículo?");
        String veiculo = input.nextLine();
        
        System.out.println("Qual a média de consumo utilizando gasolilna?");
        Byte mediaGasolina = Byte.valueOf(input.nextByte());
        
        System.out.println("Qual a média de consumo utilizando alcool?");
        Byte mediaAlcool = Byte.valueOf(input.nextByte());
        
        System.out.println("Qual a distancia a ser percorrida?");
        Integer distancia = Integer.valueOf(input.nextInt());
        
        int qtdLitrosGasolina = distancia / mediaGasolina;
        int qtdLitrosAlcool = distancia / mediaAlcool;
        
        double totalViagemComGasolina = qtdLitrosGasolina * PRECO_GASOLINA;
        double totalViagemComAlcool = qtdLitrosAlcool * PRECO_ALCOOL;
        
        System.out.println("Se utilzar gasolina você precisará de " + qtdLitrosGasolina + " litros " + 
               "para percorrer os " + distancia + "Km. E você irá gastar R$" + Math.round(totalViagemComGasolina)
                + " com o seu " + veiculo);
      
        System.out.println("Se utilzar alcool você precisara de " + qtdLitrosAlcool + " litros " + 
                "para percorrer os " + distancia + "Km. E você irá gastar R$" + Math.round(totalViagemComAlcool)
                + " com o seu " + veiculo);    
        
        input.close();
        
    }
    
}
