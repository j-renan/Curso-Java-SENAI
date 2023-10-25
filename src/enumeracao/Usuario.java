package enumeracao;

public class Usuario {
    private String login;
    private String senha;
    private String email;
    private String nome;
    private String telefone;
    private TipoUsuarioEnum tipoUsuario;

    public Usuario(String login, String senha, String email, String nome, String telefone, TipoUsuarioEnum tipoUsuario) {
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
