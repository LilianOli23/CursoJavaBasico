package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio26 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Fatorial de" + num);

        System.out.println(num + "! = ");

        int fatorial = 1;
        for(int i=num; i>1; i--){
            fatorial *= i;
            System.out.println(i + ".");
        }
        System.out.println(" . 1 = " +  fatorial);
    }
}
