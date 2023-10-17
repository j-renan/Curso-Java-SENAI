
package orientacao_objeto;

import java.time.Instant;
import java.util.Date;


public class TestesClasses {
    public static void main(String[] args) {
        //Objetos para classe Aluno
        Aluno dipirono = new Aluno();
        
        Aluno tangirino = new Aluno("Tangirino da Silva", "tangirino@gmail.coom", 25);
        
        Aluno mestruado = new Aluno("Zé Menstruado", 89, 10, 1.75f, "menstruado@gmail.com");
        
        //Objetos para classe Cidade
        Cidade ipeuna = new Cidade();
        
        Cidade piracicaba = new Cidade(500000, "Piracicaba", 256, "SP", 100, 30000);
        
        //Objetos para classe Computador
        Computador positivo = new Computador();
        
        Computador dell = new Computador("Dell", "Intel", 
                "Gabinete", "Multilaser", "Multilaser", 
                16, 500, "G-Force");
        
        //Objetos para classe Viagem
        Viagem rioDasPedras = new Viagem();
        
        Viagem fortaleza = new Viagem("Fortaleza", 3500f, 4000.50f, new Date(), new Date());
        
        System.out.println(fortaleza);
    }
    
}
