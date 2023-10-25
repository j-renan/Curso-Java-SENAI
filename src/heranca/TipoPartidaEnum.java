package heranca;


public enum TipoPartidaEnum {
    PARTIDA_ELETRICA("Partida elétrica"),
    PARTIDA_PEDAL("Partida a pedal");
    
    private String TipoPartida;

    private TipoPartidaEnum(String TipoPartida) {
        this.TipoPartida = TipoPartida;
    }

    public String getTipoPartida() {
        return TipoPartida;
    }
    
}
