import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> result = valor -> "o resultado eh: " + valor;
        String resultFinal = parOuImpar.andThen(result).apply(32);

        System.out.println(resultFinal);
        
    }
}
