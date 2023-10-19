// entrada = notas de uma turma
// saida = nota aglomerada e numero de notas validas usadas
// quando -1 digitado o programa deve parar 

import java.util.Scanner;

public class desafiowhile {
    public static void main(String[] args){
        
 // vals
        Scanner entrada = new Scanner(System.in);
        double nota;
        double turma = 0;
        int validas = 0;

// core, notas acima de 10 e abaixo de zero nao devem funcionar
        do{
            System.out.println("\ndigite sua nota: ");
            nota = entrada.nextDouble();
            if (nota>=0 && nota<=10){
                validas = validas + 1;
                turma = turma + nota;
                System.out.println("\npara sair digite -1");
            }
        } while(nota != -1);

// saida do codigo
        System.out.println("\nnota geral da turma: " + turma);
        System.out.println("notas validas: " + validas);
        entrada.close();
    }
}
