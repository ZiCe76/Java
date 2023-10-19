import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "  valor: " + p.preco);

        Produto p1 = new Produto("Caneta", 12.0, 0.0);
        imprimir.accept(p1);

        Produto p2 = new Produto("Lapis", 8.0, 0.0);
        Produto p3 = new Produto("Borracha", 5.0, 0.0);
        Produto p4 = new Produto("Tesoura", 10.0, 0.0);
        Produto p5 = new Produto("Corretivo", 11.0, 0.0);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimir);
    }
}
