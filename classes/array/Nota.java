package array;

import java.util.Arrays;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        // inicializando o scanner para pegar a quantidade de notas 

        Scanner entrada = new Scanner(System.in);
        System.out.println("quantas notas o aluno tem? ");
        int numero = entrada.nextInt();

        // inicializando o objeto array = notasAluno
        double[] notasAlunoA = new double[numero];

        // debug para ver a matriz do array convertendo para string "Arrays.toString"
        System.out.println(Arrays.toString(notasAlunoA));
        
        // inicializando as notas apartir do for de acordo com a quantidade recebida
        for(int i = 0; i < numero; i++){
            
            Scanner notas = new Scanner(System.in);
            System.out.print("digite a nota " + (i + 1) + " :");
            notasAlunoA[i] = notas.nextInt();

        }

        // sysout na matriz com as notas 
        System.out.println(Arrays.toString(notasAlunoA));

        // media das notas utilizando o foreach 
        double total = 0;
        
        for (double soma : notasAlunoA) {

            total += soma;
            
        }
        
        System.out.println(total / notasAlunoA.length);

    }
}
