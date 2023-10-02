
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Idade {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        byte idade = input.nextByte();
        
        if (idade >= 18) {
            System.out.println("Você é maoir de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        input.close();
    }
    
}
