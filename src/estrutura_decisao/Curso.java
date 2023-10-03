
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Curso {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno:");
        byte nota = input.nextByte();
        
        System.out.println("Digite a quantidade de faltas do aluno:");
        byte faltas = input.nextByte();
        
        if (nota >= 5 && faltas < 3) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
