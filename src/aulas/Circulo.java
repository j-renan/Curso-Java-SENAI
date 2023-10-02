
package aulas;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Digite o raio do circulo");
        Float raio = Float.valueOf(input.nextFloat());
        
        final float PI = (float) Math.PI;
        
        float area = PI * (raio * raio);
        
        System.out.println("A area do circulo e: " + area);
        
        input.close();
        
    }
}
