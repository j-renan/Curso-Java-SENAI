package aulas;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;


public class Aulas {    
    
    static String teste;
    /** 
     * Minha primeira classe em Java
     * <h1>TESTANDO FORMATAÇÃO</h1>
     * @param args
     * @throws UnsupportedEncodingException 
     */

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        teste = "gfdgfdsgdfs";
        String mensagem = "Hello World";
        
        System.out.println(teste + " " + mensagem);
        
        System.out.println("Qtd de argumentos: ");
        
        System.out.println(args.length);
        
        System.out.println(calcular(10, 20)); 
        

    }
    
    public static int calcular(int num1, int num2) {
        return num1 + num2;
    }
    
    
}
