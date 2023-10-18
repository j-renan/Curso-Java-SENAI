
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

    public String getMonitorMarca() {
        return monitorMarca;
    }

    public void setMonitorMarca(String monitorMarca) {
        this.monitorMarca = monitorMarca;
    }

    public String getProcessadorMarca() {
        return processadorMarca;
    }

    public void setProcessadorMarca(String processadorMarca) {
        this.processadorMarca = processadorMarca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMouseMarca() {
        return mouseMarca;
    }

    public void setMouseMarca(String mouseMarca) {
        this.mouseMarca = mouseMarca;
    }

    public String getTecladoMarca() {
        return tecladoMarca;
    }

    public void setTecladoMarca(String tecladoMarca) {
        this.tecladoMarca = tecladoMarca;
    }

    public int getQtdeMemoria() {
        return qtdeMemoria;
    }

    public void setQtdeMemoria(int qtdeMemoria) {
        this.qtdeMemoria = qtdeMemoria;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    
    
    
}
