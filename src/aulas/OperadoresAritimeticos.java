
package aulas;

public class OperadoresAritimeticos {
    
    public static void main(String[] args) {
        int numeroA = 40;
        int numerob = 25;
        
        int resultadoDaSoma = numeroA + numerob;
        int resultadoDaSubtracao = numeroA - numerob;
        int resultadoDaMultiplicacao = numeroA * numerob;
        int resultadoDaDivisao = numeroA / numerob;
        int restoDivisao = numeroA % numerob;
        
        System.out.println("Soma: " + resultadoDaSoma);
        System.out.println("Subtracao: " + resultadoDaSubtracao);
        System.out.println("Multiplicacao: " + resultadoDaMultiplicacao);
        System.out.println("Divisao: " + resultadoDaDivisao);
        System.out.println("Resto da divisao: " + restoDivisao);
        
        int incrementoNumeroA = ++numeroA;
        int decrementoNumeroB = --numerob;
        
        System.out.println("Incremento A: " + incrementoNumeroA);
        System.out.println("Decremento B: " + decrementoNumeroB);
        
                
    }
}
