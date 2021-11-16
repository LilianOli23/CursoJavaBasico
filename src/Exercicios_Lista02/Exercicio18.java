package Exercicios_Lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("ímpar");
        }

    }

}