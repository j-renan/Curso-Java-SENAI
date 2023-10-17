
package orientacao_objeto;

import estrutura_decisao.Idade;

public class Cidade {
    private int habitantes;
    private String nome;
    private int Idade;
    private String estadoPertencente;
    private int numeroBairros;
    private int numeroRuas;

    public Cidade() {
    }

    public Cidade(int habitantes, String nome, int Idade, String estadoPertencente, int numeroBairros, int numeroRuas) {
        this.habitantes = habitantes;
        this.nome = nome;
        this.Idade = Idade;
        this.estadoPertencente = estadoPertencente;
        this.numeroBairros = numeroBairros;
        this.numeroRuas = numeroRuas;
    }  
        
}
