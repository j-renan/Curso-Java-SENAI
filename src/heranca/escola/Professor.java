package heranca.escola;

public class Professor extends Pessoa{
    private String areaAtuacao;
    private int codigoAreaAtuacao;
    private boolean dedicacaoExclusiva;

    public Professor(String nome, int idade, String eMail, boolean dedicacaoExclusiva, AreaAtuacaoEnum areaAtuacaoEnum, AreaAtuacaoEnum codAreaAtuacaoEnum) {
        super(nome, idade, eMail);
        this.areaAtuacao = areaAtuacaoEnum.getNomeAreaAtuacao();
        this.codigoAreaAtuacao = codAreaAtuacaoEnum.getCodigoAreaAtuacao();
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }    

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "areaAtuacao=" + areaAtuacao + ", codigoAreaAtuacao=" + codigoAreaAtuacao + ", dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }
    
}
