
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class TernarioMedia {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a média do aluno:");
        byte media = input.nextByte();
        
        System.out.println("Digite as faltas do aluno:");
        byte faltas = input.nextByte();
        
        boolean estaAprovado = media >= 5 && faltas <= 3 ? true : false;
        
        if (estaAprovado) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        
        input.close();
    }
}
