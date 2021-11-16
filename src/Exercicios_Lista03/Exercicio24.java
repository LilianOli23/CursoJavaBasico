package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora pão de ontem - Tabela de preços");

        for (int i = 1; i < 50; i++) {
            System.out.println(i + " - R$" + (0.18 * i));
        }
    }
}
