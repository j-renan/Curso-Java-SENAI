
package aulas;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        boolean hjEhDomingo = false;
        boolean hjEstaSol = true;
        
        boolean vouJogarFutebol = hjEhDomingo && hjEstaSol;
        System.out.println("Vou jogar futebol? " + vouJogarFutebol);
        
        boolean temAulaDeJava = true;
        boolean quartaFeira = true;
        boolean sextaFeira = false;
        
        boolean vouParaAulaJava = temAulaDeJava || quartaFeira || sextaFeira;
        System.out.println("Vou para aula de Java? " + vouParaAulaJava);
        
        boolean estouEmCasa = false;
        boolean estouNoSenai = !estouEmCasa;
        
        System.out.println("Estou no SENAI estudando? " + estouNoSenai);
        
    }
    
}
