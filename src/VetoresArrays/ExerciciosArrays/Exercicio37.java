package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao A: " + i);
            vetorA[i] = scan.nextInt();
        }
        for(int i=0;i< vetorA.length; i++){

            vetorB[i] = 1;
            for(int j=1;j<= vetorA[i]; j++){
                vetorB[i] *= j;
            }
            System.out.println("Vetor A = ");
            for(i = 0; i< vetorA.length; i++){
                System.out.print(vetorA[i] + " ");
            }
            System.out.println();
            System.out.println("Vetor B = ");
            for(i = 1; i< vetorA.length; i++){
                System.out.print(vetorB[i] + " ");
            }
        }
        System.out.println();

    }
}