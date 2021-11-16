import java.io.IOException;
import java.util.Scanner;

public class DesafioIntermediarioJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //System.out.printf("A = %d, B = %d, C = %d\n", A, B, C);

        System.out.println("Entre com o primeiro número A: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número B: ");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número C: ");
        int num3 = scan.nextInt();


        if (num1 <= 10000 && num1 >= -10000) {
            System.out.println("A " + "=" + num1 + ", ");
        }
        if (num2 <= 99 && num2 >= 0) {
            System.out.println("B " + "=" + num2 + ", ");
        }
        if (num3 <= 999 && num3 >= 0) {
            System.out.println("C " + "=" + num3 + ", ");
    }
    }
}

                //implemente seu código aqui

            //A (-10000 ≤ A ≤ 10000)
            // B (0 ≤ B ≤ 99)
            // C (0 ≤ C ≤ 999)
                //Imprima a letra A, um espaço em branco, o sinal de igual, um espaço em branco,
                // o número armazenado na primeira variável, uma virgula, um espaço em branco,
                // a letra B, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado
                // na segunda variável, uma virgula, um espaço em branco,
                // a letra C, um espaço em branco, o sinal de igual, um espaço em branco, o número armazenado
                // na terceira variável. Não esqueça de pular linha;


