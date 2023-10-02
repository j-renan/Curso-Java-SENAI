package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Sorvete {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);

        System.out.println("Hoje o dia está ensolarado?");
        boolean estaSol = input.nextBoolean();

        System.out.println("Você está trabalhando?");
        boolean estaTrabalhando = input.nextBoolean();

        if (estaSol && estaTrabalhando) {
            System.out.println("Vou a sorveteria com a namorada?");
        } else {
            System.out.println("Não vou a sorveteria :(");
        }

        input.close();

    }
    
}
