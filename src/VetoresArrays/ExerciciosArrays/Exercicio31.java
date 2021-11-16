package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length]; //pares e impares

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posicao A" + i);
            vetorA[i] = scan.nextInt();
        }
        int posB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;

            }
        }
        if (vetorA[0] % 2 != 0) {
        }
        vetorB[posB] = vetorA[0];
        posB++;
        if (vetorA[1] % 2 != 0) {
        }
        vetorB[posB] = vetorA[1];
        posB++;
        if (vetorA[2] % 2 != 0) {
        }
        vetorB[posB] = vetorA[2];
        posB++;
        if (vetorA[3] % 2 != 0) {
        }
        vetorB[posB] = vetorA[3];
        posB++;
        if (vetorA[4] % 2 != 0) {
        }
        vetorB[posB] = vetorA[4];
        posB++;
        if (vetorA[5] % 2 != 0) {
        }
        vetorB[posB] = vetorA[5];
        posB++;
        if (vetorA[6] % 2 != 0) {
        }
        vetorB[posB] = vetorA[6];
        posB++;
        if (vetorA[7] % 2 != 0) {
        }
        vetorB[posB] = vetorA[7];
        posB++;
        if (vetorA[8] % 2 != 0) {
        }
        vetorB[posB] = vetorA[8];
        posB++;
        if (vetorA[9] % 2 != 0) {
        }
        vetorB[posB] = vetorA[9];
        posB++;
    }

}


