import java.util.Scanner;

public class switchnobrake {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("qual a cor da sua faixa: ");
        String faixa = entrada.nextLine();

        switch (faixa.toLowerCase()) {
        case "preta":
        System.out.println(" sei o Bassai-dai...");
        case "marrom":
        System.out.println(" sei o  Tekki Shodan");
        case "roxa":
        System.out.println(" sei o Godan");
        case "verde":
        System.out.println(" sei o Yodan");
        case "laranja":
        System.out.println(" sei o Sandan");
        case "vermelha": 
        System.out.println(" sei o Nidan");
        case "amarela":
        System.out.println(" sei o Shodan");
        case "branca":
        System.out.println(" sei nada");
        break;
        default:
        System.out.println(" faixa nao existente.");

       }
    }
}