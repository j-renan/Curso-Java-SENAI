
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

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEstadoPertencente() {
        return estadoPertencente;
    }

    public void setEstadoPertencente(String estadoPertencente) {
        this.estadoPertencente = estadoPertencente;
    }

    public int getNumeroBairros() {
        return numeroBairros;
    }

    public void setNumeroBairros(int numeroBairros) {
        this.numeroBairros = numeroBairros;
    }

    public int getNumeroRuas() {
        return numeroRuas;
    }

    public void setNumeroRuas(int numeroRuas) {
        this.numeroRuas = numeroRuas;
    }
    
    
        
}
