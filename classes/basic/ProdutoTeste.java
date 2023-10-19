
public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4357.89, 0.25);
        // antigo p1.nome = "Notebook";
        // p1.preco = 4357.89;
        // p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.0;
        p2.desconto = 0.3;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        double media = (precoFinal1 + precoFinal2)/2;
        System.out.printf("media do carrinho: %f", media);
    }
}