
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            numeros.add(i);            
        }
        
        System.out.println(Arrays.asList(numeros));
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Posicao 10 " + numeros.get(10));
        
        System.out.println("--------------------------------------------------");
        
        try {
            List<String> cidades = new ArrayList<>();
            cidades.add("Piracicaba");
            cidades.add("Tilambuco");
            
            System.out.println(Arrays.asList(cidades));

            System.out.println("Cidades na posição 2 " + cidades.get(2));
        } catch (IndexOutOfBoundsException | ArithmeticException ex) {
            System.err.println("DEU ERRO");
        } finally {
            System.out.println("TERMINEI E TRATEI O ERRO");
        }
        
        
        System.out.println("Segue o jogo");        
        
        System.out.println("--------------------------------------------------");
        
        List<Double> notas = new ArrayList<>();
        notas.addAll(Arrays.asList(2.6, 8.7, 6.7));
        
        System.out.println("Notas = " + Arrays.asList(notas));
        
        System.out.println("--------------------------------------------------");
        
        
        Carro c1 = new Carro("Fusca", "Amarelo", "VW", 1975);
        Carro c2 = new Carro("Fiat 147", "Azul", "Fiat", 1982);
        Carro c3 = new Carro("Comodoro", "Preto", "Chevrolet", 1979);

        List<Carro> carros = new ArrayList<>();
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        
        System.out.println("Carros = " + carros.toString());
        
        System.out.println("--------------------------------------------------");
        
        Aluno santana = new Aluno("Santana", 4.5f, 3.2f, 2);        
        Aluno vitor = new Aluno("Vitor", 2.32f, 7.9f, 4);        
        Aluno samanta = new Aluno("Samanta", 9.5f, 5.7f, 6);        
        Aluno arthur = new Aluno("Arthur", 2.4f, 5.6f, 1);        
        Aluno marcela = new Aluno("Marcela", 4.3f, 7.6f, 2);
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.addAll(Arrays.asList(santana, vitor, samanta, arthur, marcela));
        
        for (Aluno aluno : alunos) {
            aluno.calcularMedia();
            aluno.verificarSituacao();
        }        
               
    }    
    
}
