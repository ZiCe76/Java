import java.util.function.UnaryOperator;

public class Operador {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> quadrado = num -> num * num;

        int result = maisDois.andThen(vezesDois).andThen(quadrado).apply(0);

        System.out.println(result);

        int result2 = quadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(result2);
    }
}
