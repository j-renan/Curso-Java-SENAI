
package estrutura_repeticao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class NumerosParesWhileBreak {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        short numero = 0;
        byte contador = 0;
        
        while (numero <= 100) {            
            if (numero % 2 == 0) {
                 System.out.println("Número: " + numero);
                 contador++;
            }
            if (contador == 30) {
                break;
            }
            numero++;
        }
         
    }    
    
}
