package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de turmas: ");
        int numTurmas = scan.nextInt();

        int numAlunos;
        int soma=0;
        boolean invalido = false;

        for (int i=0; i<numTurmas; i++) {
            invalido = true;
            do {

                System.out.println("Entre com o número de alunos da turma" + i);
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                }else{
                    System.out.println("Número de alunos inválido. Digite novamente: ");
                }
            }while (invalido);
            soma += numAlunos;
        }
        double media = soma / numTurmas;
        System.out.println("Média " + media);

    }
}