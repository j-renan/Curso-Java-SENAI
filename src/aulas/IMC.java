
package aulas;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();
        
        System.out.println("Qual seu peso?");
        Float peso = Float.valueOf(input.nextFloat());
        
        System.out.println("Qual sua altura?");
        Float altura = Float.valueOf(input.nextFloat());
        
        float imc = peso / (altura * altura);
        
        System.out.println("Olá " + nome + " Seu IMC é: " + imc);     
        
        System.out.printf("Ola %s, sua altura é %.2f, "
        + "seu peso é %.2f e seu IMC é %.2f \n", 
    nome, altura, peso, imc);
        
        input.close();
         
    }
}
