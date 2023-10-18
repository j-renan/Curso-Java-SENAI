
package orientacao_objeto;

import java.time.Instant;
import java.util.Date;


public class TestesClasses {
    public static void main(String[] args) {
        //Objetos para classe Aluno
        Aluno dipirono = new Aluno();        
        Aluno tangirino = new Aluno("Tangirino da Silva", "tangirino@gmail.coom", 25);        
        Aluno mestruado = new Aluno("Zé Menstruado", 89, 10, 1.75f, "menstruado@gmail.com");
        
        tangirino.setAltura(1.92f);
        tangirino.setNota(9);
        
        System.out.println("-------------CLASSE ALUNO-----------------");
        System.out.println("Aluno: " +  tangirino.getNome());
        System.out.println("E-mail: " +  tangirino.getEmail());
        System.out.println("Altura: " + tangirino.getAltura());
        System.out.println("Nota: " + tangirino.getNota());
        System.out.println("Foi aprovado? " + tangirino.verificarNota() + " Com a nota: " + tangirino.getNota());
        tangirino.verificarMaiorIdade();
        System.out.println("\n");
        
        //Objetos para classe Cidade
        Cidade ipeuna = new Cidade();        
        Cidade piracicaba = new Cidade(500000, "Piracicaba", 256, "SP", 100, 30000);        
        
        System.out.println("-------------CLASSE CIDADE-----------------");
        System.out.println("Cidade: " +  piracicaba.getNome());
        System.out.println("Numero Habitantes: " +  piracicaba.getHabitantes());
        System.out.println("\n");
        
        //Objetos para classe Computador
        Computador positivo = new Computador();        
        Computador dell = new Computador("Dell", "Intel", 
                "Gabinete", "Multilaser", "Multilaser", 
                16, 500, "G-Force");
        
        System.out.println("-------------CLASSE COMPUTADOR-----------------");
        System.out.println("Processador: " +  dell.getProcessadorMarca());
        System.out.println("Placa de video: " +  dell.getPlacaDeVideo());
        System.out.println("\n");
        
        //Objetos para classe Viagem
        Viagem rioDasPedras = new Viagem();        
        Viagem fortaleza = new Viagem("Fortaleza", 3500f, 4000.50f, new Date(), new Date());
        
        System.out.println("-------------CLASSE VIAGEM-----------------");
        System.out.println("Destino Viagem: " +  fortaleza.getDestino());
        System.out.println("Distancia: " +  fortaleza.getDistancia());
        System.out.println("\n");
        
    }
    
}
