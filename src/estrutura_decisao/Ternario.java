
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Ternario {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual sua idade?");
        byte idade = input.nextByte();
         
        boolean maiorDeIdade = idade >= 18 ? true : false;
        
        if (maiorDeIdade) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        
        input.close();
        
    }
}
