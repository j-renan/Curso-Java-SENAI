
package estrutura_repeticao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class NumeroFor2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número menor que 1000");
        
        short numero = input.nextShort();
        
        if (numero < 1000) {
            for (int i = 0; i < numero; numero--) {
                System.out.println("Número: " + numero);                
            }
        } else {
            System.out.println("Número inválido");
        }        
        
        input.close();
    }
}
