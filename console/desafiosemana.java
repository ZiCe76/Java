// taduzir dia da semana em numero
// entrada = dia
// saida = numero
// maybe converter string para numero ou usar so if e elseif

import java.util.Scanner;
public class desafiosemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um dia da semana: ");
        String dia = entrada.nextLine();
        

        switch (dia.toLowerCase()){
            case "domingo":
            System.out.println("1");
            break;
            case "segunda":
            System.out.println("2");
            break;
            case "terca":
            System.out.println("3");
            break;
            case "quarta":
            System.out.println("4");
            break;
            case "quinta":
            System.out.println("5");
            break;
            case "sexta":
            System.out.println("6");
            break;
            case "sabadao":
            System.out.println("7");
            break;
        }
        entrada.close();
    }
}
