
package orientacao_objeto;

public class Computador {
    private String monitorMarca;
    private String processadorMarca;
    private String tipo;
    private String mouseMarca;
    private String tecladoMarca;
    private int qtdeMemoria;
    private int capacidadeArmazenamento;
    private String placaDeVideo;

    public Computador() {
    }

    public Computador(String monitorMarca, String processadorMarca, String tipo, String mouseMarca, String tecladoMarca, int qtdeMemoria, int capacidadeArmazenamento, String placaDeVideo) {
        this.monitorMarca = monitorMarca;
        this.processadorMarca = processadorMarca;
        this.tipo = tipo;
        this.mouseMarca = mouseMarca;
        this.tecladoMarca = tecladoMarca;
        this.qtdeMemoria = qtdeMemoria;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.placaDeVideo = placaDeVideo;
    }    
    
}
