/**
 * 
Crie o arquivo Desconto.java e solicite as informações abaixo via Scanner:
Nome do produto
Valor do produto
Percentual de desconto
1) Calcule o valor de desconto do produto;
2) Ao final mostre uma mensagem com as informações: nome do produto, valor original do produto, valor com desconto do produto, valor do desconto que o cliente teve.
 */

package aulas;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Desconto {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto:");
        String nomeProduto = input.nextLine();
        
        System.out.println("Digite o valor do produto:");
        Float valorProduto = Float.valueOf(input.nextFloat());
        
        System.out.println("Digite o percentual de desconto:");
        Float porcentagemDesconto = Float.valueOf(input.nextFloat()) / 100;
        
        float valorDoDesconto = valorProduto * porcentagemDesconto;
        float produtoComDesconto = valorProduto - valorDoDesconto;
        
        System.out.println(
                "Valor original do produto R$" + valorProduto + "\n" +
                "Valor do desconto R$" + valorDoDesconto + "\n" +
                "Valor do produto com desconto R$" + produtoComDesconto
        );
        
        input.close();
    }
}
