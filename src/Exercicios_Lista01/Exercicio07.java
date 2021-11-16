package Exercicios_Lista01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();

        //area = lado x lado
        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da area do quadrado é: " + (area*2));



    }


}
