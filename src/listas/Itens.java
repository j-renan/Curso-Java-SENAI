
package listas;

import java.util.Arrays;


public class Itens {
    public static void main(String[] args) {
        int[] numeros = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 110};
        
        System.out.println("Valor posição 2 = " + numeros[2]);
        
        int[] numeros2 = new int[101];
        
        for (int i = 0; i <= 100; i++) {
            numeros2[i] = i;
        }
        
        System.out.println("Array numeros2 = " + Arrays.toString(numeros2));
        
        String[] cidades = {"Piracicaba", "Campinas", "Charqueada", "Ipeúna", "Jaú"};
        
        System.out.println("Cidades = " + Arrays.toString(cidades));
        
        float[] notas = {8.55f, 5.00f, 3.35f, 6.20f, 9.80f};
        
        System.out.println("Notas = " + Arrays.toString(notas) + " Tamanho array = " + notas.length);
    }
}
