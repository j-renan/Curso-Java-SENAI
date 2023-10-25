
package Telas.classes;


public class Colaborador {
    private final float AUMENTO = 0.17f;    
               
    private String nome;
    private float valorDoAumento;
    private float salarioAtual;    

    public Colaborador(String nome, float salarioAtual) {        
        this.nome = nome;
        this.salarioAtual = salarioAtual;        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioAtual(float salarioAtual) {
        this.salarioAtual = salarioAtual;
    }
    
    public float calcularAumento() {
        this.valorDoAumento = salarioAtual * AUMENTO;
        return this.valorDoAumento;        
    }
    
    public String avaliarAumento() {
        String avaliacaoAumento = "";
        
        if (valorDoAumento >= 150.00f && valorDoAumento <= 300.00f) {
            avaliacaoAumento = "Você teve um aumento razoável de salário";
        } else if (valorDoAumento > 300.00f && valorDoAumento <= 450.00f) {
            avaliacaoAumento = "Você teve um bom aumento de salário";
        } else if (valorDoAumento > 450.00f) {
            avaliacaoAumento = "Você teve um baita de um aumento de salário";
        } else {
            avaliacaoAumento = "Esse aumento não da nem pra pagar uma pinga!";
        }
        return avaliacaoAumento;
    }
}
