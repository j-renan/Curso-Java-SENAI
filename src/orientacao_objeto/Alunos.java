
package orientacao_objeto;

public class Alunos {
    private String nome;
    private byte idade;
    private float nota;
    private float altura;
    private String email;
    
    public Alunos() {             
    }

    public Alunos(String nome, byte idade, float nota, float altura, String email) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.altura = altura;
        this.email = email;
    }

    public Alunos(String nome, String email, byte idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }   
     
}
