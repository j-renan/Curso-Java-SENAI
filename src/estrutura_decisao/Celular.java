
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Celular {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vendedor, qual o valor do celular?");
        float valorCelular = input.nextFloat();        
        
        char formaDePagamento;        
        
        
        while (true) {            
            System.out.println("Qual a forma de pagamento? \n" + 
                "Digite 1 para a vista ou 2 para parcelado");
            formaDePagamento = input.next().charAt(0);
            
            if (formaDePagamento == '1' || formaDePagamento == '2') {
                break;
            } else {
                System.out.println("Entrada inválida, permitido apenas 1 ou 2");
            }
        }
        
        float orcamento = 1750.00f;
        float desconto = 0f;        
             
        if (formaDePagamento == '1') {
            System.out.println("Pagamento a vista");
            desconto = valorCelular * 0.10f;
        }         
        
        
        float valorFinalCelular = valorCelular - desconto;
        
        if (valorFinalCelular <= orcamento && formaDePagamento == '1') {
            System.out.println("Comprei celular com desconto! :-) \n" + 
                    "No valor de R$" + valorFinalCelular + "\n" +
                    "Valor do desconto: R$" + desconto);
        } else if (valorFinalCelular <= orcamento && formaDePagamento == '2'){
            System.out.println("Comprei o celular sem desconto :-|");
        } else {
            System.out.println("Não comprei porcaria nenhuma! :-( \n" + 
                    "Duro ser pobre");
        }
        
        input.close();
    }
    
}
