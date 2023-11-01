
package listas;

import java.util.Arrays;

public class MediasAlunos {
    public static void main(String[] args) { 
        
        // Armazenar 5 notas de alunos com decimais
        double[] notas = {2.4, 7.8, 9.0, 2.3, 5.4};
        System.out.println(Arrays.toString(notas));
       
        // Declaração dos vetores com os dados
        // Versão sem classes
        String[] alunos = {"Santana", "Vitor", "Arthur",
                            "Samanta", "Marcela"};
        double[] notas1 = {4.5, 2.3, 9.5, 2.4, 4.3};
        double[] notas2 = {3.2, 7.9, 5.7, 5.6, 7.6};
        int[] faltas = {2, 4, 2, 1, 2};
       
        for (int i = 0; i < alunos.length; i++) {
            double nota1 = notas1[i];
            double nota2 = notas2[i];
            double media = (nota1 + nota2) / 2;
            int faltasAluno = faltas[i];
           
            String aluno = alunos[i];
           
            if (media > 7 && faltasAluno <= 2) {
                System.out.println("Aluno : " + aluno +
                        " esta aprovado, media : " + media +
                        " faltas : " + faltasAluno);
            } else if (media >= 5 && media <= 7 && faltasAluno <= 3) {
                System.out.println("Aluno : " + aluno +
                        " esta reprovado, media : " + media +
                        " faltas : " + faltasAluno);
            } else if (faltasAluno > 3) {
                System.out.println("Aluno : " + aluno +
                        " esta reprovado por faltas: "
                        + faltasAluno);
            } else if (media < 5) {
                System.out.println("Aluno : " + aluno +
                        " esta reprovado por media: "
                        + media);
            }
        }
        
        System.out.println("---------------------------------------------");
        
        Aluno santana = new Aluno("Santana", 4.5f, 3.2f, 2);
        
        Aluno vitor = new Aluno("Vitor", 2.32f, 7.9f, 4);
        
        Aluno samanta = new Aluno("Samanta", 9.5f, 5.7f, 6);
        
        Aluno arthur = new Aluno("Arthur", 2.4f, 5.6f, 1);
        
        Aluno marcela = new Aluno("Marcela", 4.3f, 7.6f, 2);
        
        Aluno[] alunoAprovado = {santana, vitor, samanta, arthur, marcela};
        
        for (Aluno alunoClasse : alunoAprovado) {
            alunoClasse.calcularMedia();
            alunoClasse.verificarSituacao();
        }
    }
}
