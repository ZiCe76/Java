//lista de compra
//nome

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }
    double valorTotal() {
        double total = 0;

        for(Compra compra: compras){
            total += compra.obterValorToral();
        }
        return total;
    }
 }
