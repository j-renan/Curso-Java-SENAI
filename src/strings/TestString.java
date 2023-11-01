
package strings;

import java.util.Arrays;


public class TestString {
    public static void main(String[] args) {
        String cidade = "Piracicaba";
        int tamanho = cidade.length();
        System.out.println("O nome da cidade " + cidade + " tem " + tamanho + " caracteres");
        
        String mensagem = " eh muito bonita!";
        
        System.out.println(cidade.concat(mensagem));
        
        String aluno = "Arabio Saudito";
        double nota = 5.9;
        boolean aprovado = true;
        
        String mensagemAluno = String.format("O aluno %s, ficou com nota %.2f, " 
                + "ele esta aprovado? %b", aluno, nota, aprovado);
        
        System.out.println(mensagemAluno);
        
        String idade = "18";
        int idadeValor = Integer.parseInt(idade);
        
        int numero = 30;
        String numeroString = Integer.toString(numero);
        
        String bairro = "Morumbi";
        String pLetra = String.valueOf(bairro.charAt(0));
        String uLetra = String.valueOf(bairro.charAt(bairro.length() - 1));
        
        System.out.println("Primeira letra da palavra eh " + pLetra + " e a ultima letra eh "
            + uLetra);       
        
        String apelido = cidade.substring(0, 4);
        System.out.println("O apelido da cidade eh " + apelido);
        
        String finalCidade = cidade.substring(4);
        System.out.println("Final Cidade = " + finalCidade);
        
        String escola = "Escola SENAI Mario Henrique Simonsen";
        String[] partes = escola.split(" ");
        System.out.println(Arrays.toString(partes));   
        
        String curso = " Java avançado ";
        System.out.println("Estou fazendo curso de " + curso.trim() + " no SENAI");
        
        System.out.println(escola.toUpperCase());
        System.out.println(escola.toLowerCase());
        
        int letraU = aluno.indexOf("u");
        System.out.println(letraU);
        
        int letraO = escola.lastIndexOf("o");
        System.out.println(letraO);
        
        System.out.println(escola.replace(" ", "__"));
        
        System.out.println(escola.replaceFirst(" ", "__"));
        
        String email = "dipirono@gmail.com";
        System.out.println(email.contains("@gmail.com"));
        
        String texto = "Cagar é bom demais!";
        System.out.println(texto.endsWith("!"));
        System.out.println(texto.startsWith("Cagar"));
        
        String texto1 = "Jamanta não morreu";
        String texto2 = "JAMANTA NÃO MORREU";
        
        System.out.println(texto1.compareTo(texto2));
        System.out.println(texto1.compareToIgnoreCase(texto2));
        System.out.println(texto1.length());
    }
}
