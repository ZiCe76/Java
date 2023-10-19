import java.util.Scanner;

public class DesafioDataTeste {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);

        // criando as datas da classe
        DesafioData d1 = new DesafioData();
        System.out.println("Digite o dia 1: ");
        d1.dia = entrada.nextInt();

        System.out.println("Digite o mes 1: ");
        d1.mes = entrada.nextInt();

        System.out.println("Digite o ano 1: ");
        d1.ano = entrada.nextInt();

        DesafioData d2 = new DesafioData();
        System.out.println("Digite o dia 2: ");
        d2.dia = entrada.nextInt();

        System.out.println("Digite o mes 2: ");
        d2.mes = entrada.nextInt();

        System.out.println("Digite o ano 2: ");
        d2.ano = entrada.nextInt();

        // print das datas
        System.out.print("Data 1: \n");
        System.out.println(d1.DataFormatada());

        System.out.print("Data 2: \n ");
        System.out.println(d2.DataFormatada());        
    }
}