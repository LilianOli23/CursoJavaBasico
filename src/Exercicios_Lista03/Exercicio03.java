package Exercicios_Lista03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo;
        int idade;
        double salario;
        String estadoCivil;

        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();
            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa de no mínimo 3 caracteres.");
            }
            while (!infoValida) ;

            infoValida = false;

            do {
                System.out.println("Entre com a idade: ");
                idade = scan.nextInt();
                if (idade >= 0 && idade <= 150) {
                    infoValida = true;
                } else {
                    System.out.println("Idade precisa ser entre 0 e 150.");
                }
                while (!infoValida) ;

                infoValida = false;
                do {
                    System.out.println("Entre com o salário: ");
                    salario = scan.nextDouble();
                    if (salario > 0) {
                        infoValida = true;
                    } else {
                        System.out.println("Idade precisa ser maior que 0.");
                    }
                } while (!infoValida);

                infoValida = false;
                do {
                    System.out.println("Entre com o sexo: ");
                    sexo = scan.next();
                    if (sexo.equalsIgnoreCase("f") ||
                            sexo.equalsIgnoreCase("m")) {
                        infoValida = true;
                    } else {
                        System.out.println("Sexo precisa ser 'f' ou 'm'.");
                    }
                } while (!infoValida);

                infoValida = false;
                do {
                    System.out.println("Entre com o estado civil: ");
                    estadoCivil = scan.next();
                    if (estadoCivil.equalsIgnoreCase("c") ||
                            estadoCivil.equalsIgnoreCase("s") ||
                            estadoCivil.equalsIgnoreCase("d") ||
                            estadoCivil.equalsIgnoreCase("v")) {
                        infoValida = true;
                    } else {
                        System.out.println("Estado civil precisa ser 'c', 's', 'd' ou 'v'.");
                    }
                } while (!infoValida);

                System.out.println("As seguintes informacoes foram coletadas: ");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Salario: " + salario);
                System.out.println("Sexo: " + sexo);
                System.out.println("Estado civil: " + estadoCivil);

            }while (!infoValida);
        }while (!infoValida);
    }
}