package aulas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Variaveis {
    
    public static void main(String[] args) {
        
        String nome = "João Renan";
        int idade = 37;
        boolean estudando = true;
        double altura = 1.80;
        float peso = 94.50f;
        char letra = 'R';
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Está etudando?: " + estudando);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Letra: " + letra);
        
        String termoDePesquisa = "resultadojogosaopauloeflamengo";

        // Substitua a URL base pelo mecanismo de pesquisa desejado
        String urlBase = "https://www.google.com.br/search?q=";

        try {
            // Concatena o termo de pesquisa com a URL base e cria um objeto URI
            String urlCompleta = urlBase + termoDePesquisa;           

            // Abre o navegador padrão com a URL da pesquisa
            Desktop.getDesktop().browse(new URI(urlCompleta));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }     
    
}