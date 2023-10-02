package aulas;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        Tipos Primitivos em Java
        */
        
        /*
        Tipos númericos
        */
        // - Intervalo: -128 até 127
        // - Armazena 8 bits ou 1 byte
        byte numeroByte = 25;        
        System.out.println(numeroByte);
        
        // - Intervalo: -32.768 até 32.767
        // - Armazena 16 bits ou 2 bytes
        short numeroShort = 25478;
        
        // - Intervalo: -2.147.483.648 até 2.147.483.648
        // - Armazena 32 bits ou 4 bytes
        int numeroInt = 2145213678;
        
        // - Precisa colocar f no final
        // - Intervalo:  -9223372036854775808 até 9223372036854775807
        // - Armazena 64 bits ou 8 bytes
        long numeroLong = 9223372036854775807L;
        
        /*
        Tipos númericos ponto flutuante
        */
        // - Precisa colocar f no final, senão o compilador vai considerar como double
        // - Armazena 32 bits ou 4 bytes, com precisão simples
        float numeroFloat = 15.84154212f;
        
        /*
        Tipos númericos double
        */    
        // - Armazena 64 bits ou 8 bytes, com precisão simples
        double numeroDouble = 47.96;

        /*
        Tipos booleanos
        */    
        // - Armazena 1 bit      
        boolean estudando = true;
        boolean estaDeFolga = false;
        
        /*
        Tipos caractere
        */    
        // - Armazena 16 bits ou 2 bytes
        char letra = 'M';        
        
    }
    
}
