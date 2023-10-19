import java.util.Scanner;

public class nota {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double nota;
        
        do{
            System.out.println("digite sua nota: ");
            nota = entrada.nextDouble();
        } while(nota>10);
        
        if (nota>=7) {
        System.out.println("aprovado!");
        System.out.println("parabens!");
        }
        if (nota<7) {
            System.out.println("reprovado!");
            System.out.println("que pena!");
        }
        
        entrada.close();

    }
    
}
