
package estrutura_repeticao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class NumerosParesForBreak {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        byte contador = 0;
               
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Número: " + i);         
                contador++;
            }
            
            if (contador == 30) {
                break;
            }
        }
    }
}
