
package aulas;

public class Wrappers {
    public static void main(String[] args) {
        /*
        Exemplo de wrappers em Java
        */
        
        System.out.println("Byte----------------------------------------------");
        
        Byte diaSemana = Byte.valueOf("29");
        System.out.println(diaSemana);
        System.out.println(diaSemana.getClass());
        System.out.println(Byte.BYTES);
        
        System.out.println("Short----------------------------------------------");
        
        Short ano = Short.valueOf("2023");
        System.out.println(ano);
        System.out.println(ano.getClass());
        System.out.println(Short.BYTES);
        
        System.out.println("Integer----------------------------------------------");
        
        Integer idade = Integer.valueOf("37");
        System.out.println(idade);
        System.out.println(idade.getClass());
        System.out.println(Short.BYTES);
        
        System.out.println("Long----------------------------------------------");
        
        Long salario = Long.valueOf("3712654643212546");
        System.out.println(salario);
        System.out.println(salario.getClass());
        System.out.println(salario.BYTES);
    }
}
