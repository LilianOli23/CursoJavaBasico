package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[11];
        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int) Math.pow(2, i);
        }
        System.out.println("Vetor A = ");
        for(int i=0; i<vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
    }
}