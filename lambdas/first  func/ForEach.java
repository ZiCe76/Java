import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Giu" );
    
        System.out.println("Forma padrao...");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("Forma lambda #01");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
    
        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::print);

        System.out.println("Forma lambda #02");
        aprovados.forEach(nome -> meuImprimir(nome + "!!!"));

    }    
    
    static void meuImprimir(String nome) {
        System.out.println("oi meu nome eh " + nome);
    }
}
