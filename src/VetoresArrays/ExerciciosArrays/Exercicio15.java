package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição "  + i);
            vetorA[i] = scan.nextInt();

        }
        int soma = 0;
        int impar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                impar++;
            }
        }
        int par = vetorA.length - impar;

        int porcPar = (par * 100)/ vetorA.length;
        int porcImpar = (impar * 100)/ vetorA.length;

        System.out.println("Vetor A = ");
        for(int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + "  ");
        }
        System.out.println();

        System.out.println("Porcentagem de pares: "  + porcPar + "%");
        System.out.println("Porcentagem de ímpares: " + porcImpar + "%" );

    }
}
