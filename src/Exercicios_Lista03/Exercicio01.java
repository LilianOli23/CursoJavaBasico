package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {


            System.out.println("Entre com uma nota ");

            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou a nota: " + nota);
            } else {
                notaValida = false;
                System.out.println("Nota inválida, digite novamente.");
            }

        } while (!notaValida);
    }
}
