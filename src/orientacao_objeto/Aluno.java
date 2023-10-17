
package orientacao_objeto;

public class Aluno {
    private String nome;
    private int idade;
    private float nota;
    private float altura;
    private String email;
    
    public Aluno() {             
    }

    public Aluno(String nome, int idade, float nota, float altura, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.altura = altura;
        this.email = email;
    }

    public Aluno(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
     
}
