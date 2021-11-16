package Condicionais;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o preço do item: ");

        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor < 10 && valor < 15) {
            System.out.println("Você pode pedir um desnconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {//valor >=17
            System.out.println("Está muito caro.");

        }
    }
}