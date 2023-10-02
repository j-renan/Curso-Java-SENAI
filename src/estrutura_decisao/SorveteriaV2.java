
package estrutura_decisao;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class SorveteriaV2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner input = new Scanner(System.in);

        System.out.println("Hoje o dia está ensolarado?");
        String estaSol = input.nextLine();

        System.out.println("Você está trabalhando?");
        String estaTrabalhando = input.nextLine();

        if (estaSol.equalsIgnoreCase("sim") && estaTrabalhando.equalsIgnoreCase("sim")) {
            System.out.println("Vou a sorveteria com a namorada!");
        } else {
            System.out.println("Não vou a sorveteria :(");
        }

        input.close();

    }
}
