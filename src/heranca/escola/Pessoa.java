
package heranca.escola;


public class Pessoa {
    private String nome;
    private int idade;
    private String eMail;

    public Pessoa(String nome, int idade, String eMail) {
        this.nome = nome;
        this.idade = idade;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", eMail=" + eMail + '}';
    }    
    
}
