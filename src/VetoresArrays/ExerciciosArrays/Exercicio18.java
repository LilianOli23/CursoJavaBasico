package VetoresArrays.ExerciciosArrays;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade da pessoa:  " + (i + 1));
            idades[i] = scan.nextInt();
        }
        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = idades[0];

        for(int i=0; i< idades.length; i++){
            if(idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            }else if(idades[i] < menor){
                menor = idades[i];
                indexMenor = i;
            }
        }
        System.out.println("Vetor de idades =");
        for(int i=0; i< idades.length;i++){
            System.out.println(idades[i] + "  ");
        }
        System.out.println();

        System.out.println("Menor idade: " + menor);
        System.out.println("Índice da menor idade: " + indexMenor);

        System.out.println("Maior idade: " + maior);
        System.out.println("Índice da maior idade: " + indexMaior);
    }
}