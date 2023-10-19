import java.util.Scanner;

public class fazer {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String texto = "porfavor";
        
        do{
            System.out.println("palavra maigca: ");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("obrigado!");
        entrada.close();

    }
    
}
