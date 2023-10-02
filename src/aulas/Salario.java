/**
 * Crie o arquivo Salario.java para calcular o aumento do salário do funcionário, solicite as seguintes informações via Scanner:
Nome do funcionário
Salário atual
1) Aplique um aumento de 17% sobre o salário atual;

2) Ao final mostre uma mensagem com as informações: nome, salário antigo, novo salário, valor do aumento;
 */
package aulas;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();
        
        System.out.println("Digite seu salário atual:");
        Float salarioAtual = Float.valueOf(input.nextFloat());
        
        float AUMENTO = 0.17f;
        float valorDoAumento = salarioAtual * AUMENTO;
        float novoSalario =  valorDoAumento + salarioAtual;
        
        System.out.println("Nome: " + nome + "\n"
        + "Salario antigo: R$" + salarioAtual + "\n"
        + "Valor do aumento: R$" + valorDoAumento + "\n"
        + "Novo salário:  R$" + novoSalario
        );
        
        input.close();
        
    }
}
