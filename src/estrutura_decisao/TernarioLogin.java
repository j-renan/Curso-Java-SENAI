
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TernarioLogin {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);
        
        System.out.println("Você está logado no sistema?");
        boolean logado = input.nextBoolean();
        
        String msg = logado ? "Ok, logou Administrador" : "Acessou como visitante";
        
        System.out.println(msg);
        
        input.close();
    
    }
    
}
