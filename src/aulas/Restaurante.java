/**
 * Resumo

Crie o arquivo Restaurante.java para calcular o valor final de cada pessoa no rodízio de pizza. O programa deve perguntar via Scanner as seguintes informações:
Número de pessoas maiores que 13 anos
Número de pessoas menores que 13 anos
1) Cada pessoa maior que 13 anos paga 69,90 pelo rodízio
2) Cada pessoa menor que 13 anos paga 39,90 pelo rodízio
3) Acrescente ao final uma taxa de 10% do serviço de garçom
4) Ao final mostre uma mensagem com as informações: total da conta, valor da taxa do serviço do garçom, total geral somando a taxa do garçom com a conta.
 */
package aulas;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Restaurante {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quantas pessoas são maiores que 13 anos?");
        Short maiores13anos = Short.valueOf(input.nextShort());
        
        System.out.println("Quantas pessoas são menores que 13 anos?");
        Short menores13anos = Short.valueOf(input.nextShort());
        
        float valorUnitarioMaior13anos = 69.90f;
        float valorUnitarioMenor13anos = 39.90f;
        
        double valorTotalMaiores13anos = maiores13anos * valorUnitarioMaior13anos;
        double valorTotalMenores13anos = menores13anos * valorUnitarioMenor13anos;
        
        double totalSemTaxaGarcom = valorTotalMaiores13anos + valorTotalMenores13anos;
        
        double taxaGarcom = totalSemTaxaGarcom * 0.10;
        
        double totalGeral = taxaGarcom + totalSemTaxaGarcom;
        
        System.out.println("O total do rodizio ficou em R$" + totalGeral + "\n" +
                "Sendo:" + "\n" + 
                "Taxa de serviço: R$" + taxaGarcom + "\n" +
                "Valor sem taxa de serviço: R$" + totalSemTaxaGarcom
                );
        
        input.close();
        
    }
    
}
