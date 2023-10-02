package aulas;

public class OperadoresDeComparacao {
    
    public static void main(String[] args) {
        int numeroA = 78;
        int numeroB = 90;
        
        boolean numerosSaoIguais = numeroA == numeroB;
        System.out.println("Numeros sao iguais ? " + numerosSaoIguais);
        
        boolean numerosSaoDiferentes = numeroA != numeroB;
        System.out.println("Numeros sao diferentes ? " + numerosSaoDiferentes);
        
        boolean numeroAmaiorQueNumeroB = numeroA > numeroB;
        System.out.println("Numero A maior que B ? " + numeroAmaiorQueNumeroB);
        
        boolean numeroAmaiorOuIgualNumeroB = numeroA > numeroB;
        System.out.println("Numero A maior ou igual a B ? " + numeroAmaiorOuIgualNumeroB);
        
        boolean numeroAmenorQueNumeroB = numeroA < numeroB;
        System.out.println("Numero A menor que B ? " + numeroAmenorQueNumeroB);
        
        boolean numeroAmenorOuIgualNumeroB = numeroA > numeroB;
        System.out.println("Numero A menor ou igual a B ? " + numeroAmenorOuIgualNumeroB);
    }
}
