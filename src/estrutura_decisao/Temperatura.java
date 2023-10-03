
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Temperatura {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual a temperatura do dia?");
        byte temperatura = input.nextByte();
        
        if (temperatura <= 10) {
            System.out.println("Está ficando frio");            
        } else if (temperatura > 10 && temperatura <= 17) {
            System.out.println("Está ficando agradavel");
        } else if (temperatura > 17 && temperatura <= 27) {
            System.out.println("Está ficando calor");
        } else if (temperatura > 27 && temperatura <= 37) {
            System.out.println("Está muito calor");
        } else {
            System.out.println("Derretendo os miolos");
        }
    }
    
}
