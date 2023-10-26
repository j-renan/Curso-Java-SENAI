
package heranca.escola;

public enum AreaAtuacaoEnum {
    TECNOLOGIA_INFORMACAO("Técnologia da informação", 100),
    ELETRO_ELETRONICA("Életro eletronica", 200),
    METAL_MECANICA("Metal mecânica", 300),
    MOBILIARIO("Madeira e Móveis", 400);
    
    private String nomeAreaAtuacao;
    private int codigoAreaAtuacao;

    private AreaAtuacaoEnum(String nomeAreaAtuacao, int codigoAreaAtuacao) {
        this.nomeAreaAtuacao = nomeAreaAtuacao;
        this.codigoAreaAtuacao = codigoAreaAtuacao;
    }

    public String getNomeAreaAtuacao() {
        return nomeAreaAtuacao;
    }

    public int getCodigoAreaAtuacao() {
        return codigoAreaAtuacao;
    }

}
