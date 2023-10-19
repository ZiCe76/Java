/* 
 * valor real com desconto
 * Imposto municipal: valor >= 2500 (8,5%)
 * Frete: valor >3000 (100) / valor <3000 (50)
 * Arredondar casas
 * Formatar: R$1234,56
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Run {
    public static void main(String[] args) {
        
        Produto p = new Produto("Ipad", 3235.89, 0.13);

        BinaryOperator<Double> calcDesconto = (n1, n2) -> n1 * (1 - n2);
        
        BinaryOperator<Double> calcImposto = (n1, n2) -> n1 >= 2500 ? n1 * (1 + n2) : n1;

        UnaryOperator<Double> calcFrete = n1 -> n1 >= 3000 ? n1 + 100  : n1 + 50;

        double valorReal = calcDesconto.apply(p.preco, p.desconto);
        double valorFinal = calcImposto.andThen(calcFrete).apply(valorReal, 0.085);

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        String roundOff = df.format(valorFinal);
        System.out.println("R$" + roundOff);      
    }
}
