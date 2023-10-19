import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();    

    /**
     * @param p
     * @param quantidade
     */
    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }
    double obterValorToral() {
        double total = 0;
        
        for(Item item: itens){
            total+= item.quantidade * item.produto.valor;
        }
        return total;

    }
}
