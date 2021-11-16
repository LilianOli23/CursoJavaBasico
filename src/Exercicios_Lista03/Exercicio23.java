package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lojas Quase Dois - Tabela de Preços");

        for(int i=1; i<50; i++){
            System.out.println(i + " - R$" + (1.99*i));
        }
    }
}