package Exercicios_Lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra é uma vogal.");
        }if (letra.length() > 1) {
            System.out.println("Não é uma letra válida.");
        } else {
            System.out.println("A letra é uma consoante.");
        }
    }
}
