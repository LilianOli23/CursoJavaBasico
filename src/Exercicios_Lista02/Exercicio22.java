package Exercicios_Lista02;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maçã:");
        double qtdMaca = scan.nextDouble();

        double precoKgMorango = 0;
        if(qtdMorango <= 5){
            precoKgMorango = 2.5;
        }else{
            precoKgMorango = 2.2;
        }
        double precoKgMaca = 0;
        if(qtdMaca <= 5){
            precoKgMaca = 1.8;
        }else {
            precoKgMaca = 1.5;
        }

        double precoTotalMorango = qtdMorango * precoKgMorango;
        double precoTotalMaca = qtdMaca * precoKgMaca;

        double precoParcial = precoTotalMorango + precoTotalMaca;
        double precoTotal = precoParcial;

        if((qtdMorango + qtdMaca) >= 8 || precoParcial > 25){
             precoTotal = precoParcial * 0.9;

             System.out.println("Preco total = " + precoTotal);

        }else{
            System.out.println("Preco total = " + precoTotal);
        }

    }
}
