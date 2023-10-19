public class Produto {
    
    String nome;
    Double preco;
    Double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
    Produto() {
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
    
    double precoComDesconto(double DescontoDoGerente) {
        return preco * (1 - desconto - DescontoDoGerente);
    }
}
