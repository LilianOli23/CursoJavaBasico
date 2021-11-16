package OrientacaoObjetosEmJava.VariaveisEMetodosEstaticos.Exercicios;

import OrientacaoObjetosEmJava.VariaveisEMetodosEstaticos.MinhaCalculadora;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do{
            System.out.println("Entre com um número positivo: ");
            num = scan.nextInt();

            if(num<0){
                System.out.println("Número Inválido! Entre com um número positivo: ");

            }
        }while(num<0);
        System.out.println(MinhaCalculadora.fatorial(num));
    }
}
