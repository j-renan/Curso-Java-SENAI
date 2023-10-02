package aulas;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EntradaDados {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        /*
        Utilizando entrada de dados com Scanner
        Precisa importar a classe Scanner
        import java.util.Scanner;
        */
        
        /**
         * Pergunte ao usuário seu nome e o ano que nasceu
         * Calcule sua idade com base no ano atual
         * Mostre uma mensagem na saída com as informações
         */
        
        //Declaração do scanner
        Scanner input = new Scanner(System.in);
        short anoAtual = 2023;
        
        //Entrada de dados
        //Nome
        System.out.println("Qual seu nome?");
        String nome = input.nextLine();
        
        //Ano nascimento
        System.out.println("Qual o ano que você nasceu?");
        short anoNascimento = input.nextShort();
        if (anoNascimento >= anoAtual) {
            System.out.println("Não pode CABEÇÃO!");      
            System.out.println("Qual o ano que você nasceu?");
            anoNascimento = input.nextShort();
        }
        
        //Processamento
        
        short idade = (short) (anoAtual - anoNascimento);
        
        System.out.println("Seja bem vindo " + nome + " você tem " + idade + " anos");
        input.close();
    }
    
}
