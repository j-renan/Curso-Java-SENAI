
package estrutura_repeticao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class NumerosWhile1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número menor que 1000");
        
        short numero = input.nextShort();
        
        byte contador = 0;
        
        while (contador < numero) {            
            System.out.println("Número: " + contador);
            contador++;
        }
        
        input.close();    
    }    
}
