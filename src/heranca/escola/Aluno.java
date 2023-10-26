
package heranca.escola;


public class Aluno extends Pessoa {
    private String ra;
    private boolean matriculado;

    public Aluno(String nome, int idade, String eMail, String ra, boolean matriculado) {
        super(nome, idade, eMail);
        this.ra = ra;
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Aluno{" + "ra=" + ra + ", matriculado=" + matriculado + '}';
    }
            
}
