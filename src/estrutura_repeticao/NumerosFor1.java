
package estrutura_repeticao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class NumerosFor1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número menor que 1000");
        
        short numero = input.nextShort();
        
        if (numero < 1000) {
            for (int i = 0; i < numero; i++) {
                System.out.println("Número: " + i);
            }
        } else {
            System.out.println("Número inválido");
        }        
        
        input.close();
        
    }
    
}
