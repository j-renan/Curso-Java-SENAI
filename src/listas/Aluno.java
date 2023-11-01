
package listas;

public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;
    private int faltas;
    private float media;

    public Aluno(String nome, float nota1, float nota2, int faltas) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", faltas=" + faltas + ", media=" + media + '}';
    }
       
    public float calcularMedia() {                
        return this.media = (nota1 + nota2) / 2;        
    }
    
    public void verificarSituacao() {
            if (media > 7 && faltas <= 2) {
                System.out.println("Aluno : " + nome +
                        " esta aprovado, media : " + media +
                        " faltas : " + faltas);
            } else if (media >= 5 && media <= 7 && faltas <= 3) {
                System.out.println("Aluno : " + nome +
                        " esta reprovado, media : " + media +
                        " faltas : " + faltas);
            } else if (faltas > 3) {
                System.out.println("Aluno : " + nome +
                        " esta reprovado por faltas: "
                        + faltas);
            } else if (media < 5) {
                System.out.println("Aluno : " + nome +
                        " esta reprovado por media: "
                        + media);
            }
    } 
    
}
