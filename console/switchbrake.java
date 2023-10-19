import java.util.Scanner;

public class switchbrake {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        int nota = entrada.nextInt();
        String conceito = "";

        switch(nota) {
            case 10: case 9:
            conceito = "A";
            break;
            case 8: case 7:
            conceito = "B";
            break;
            case 6: case 5:
            conceito = "C";
            break;
            case 4: case 3:
            conceito = "D";
            break;
            case 2: case 1:
            conceito = "E";
            break;
            default:
            conceito = "nao informado, digite um valor valido entre: (1-10)";
            break;
        } 
        System.out.println("Seu conceito eh: "+ conceito);
    }
}
