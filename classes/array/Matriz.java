package array;

import java.util.Scanner;
import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("quantos alunos? ");
        int qntdeAlunos = entrada.nextInt();

        System.out.println("quantas notas por alunos? ");
        int qntdeNotas = entrada.nextInt();

        double[][] notasTurma = new double[qntdeAlunos][qntdeNotas];
        double total = 0;

        for(int i = 0; i < notasTurma.length; i++) {
            for (int j = 0; j < notasTurma[i].length; j++) {
                
                System.out.printf("digite a nota %d do aluno %d : ", j+1, i+1);
                notasTurma[i][j] = entrada.nextDouble();
                total += notasTurma[i][j];
            }
        }
        
        double media = total / (qntdeAlunos * qntdeNotas);
        System.out.println(media);
        
        for(double[] notaDoAluno : notasTurma){

        System.out.println(Arrays.toString(notaDoAluno));

        }
        entrada.close();
    }
}
