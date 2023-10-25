package enumeracao;

public class TestEnum {

    public static void main(String[] args) {
        Usuario comum = new Usuario("comum123",
                "123", "comum@gmail.com",
                "usuario comum",
                "19 9 9876-1234",
                TipoUsuarioEnum.COMUM);

        Usuario tecnico = new Usuario("tecnico123",
                "123", "tecnico@gmail.com",
                "usuario tecnico",
                "19 3434-8989",
                TipoUsuarioEnum.TECNICO);

        Usuario adm = new Usuario("adm123",
                "123",
                "adm@gmail.com",
                "adm user",
                "19 3434-3434",
                TipoUsuarioEnum.ADMINISTRADOR);

        Produto detergente = new Produto(
                "Detergente Ype",
                2.99,
                StatusEnum.EM_PREPARACAO.getStatus());
        System.out.println(detergente);
    }
}
