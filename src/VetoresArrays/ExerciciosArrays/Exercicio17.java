package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i=0; i< vetorA.length; i++){
            System.out.println("Entre com a idade da pessoa:  " + i);
            vetorA[i] = scan.nextInt();
        }
        int qtd = 0;
        for(int i=0; i< vetorA.length; i++){
            if(vetorA[i]>35){
                qtd++;
            }
        }
        System.out.println("Vetor A = ");
        for(int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + "  ");
        }
        System.out.println();
        System.out.println("Qtd pessoas idade > 35:  " + qtd + " pessoas");

    }
}
