import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supply {
    public static void main(String[] args) {
        
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Giu");
        
        System.out.println(umaLista.get());
    }
}
