package OrientacaoObjetosEmJava.Recursividade;

import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {

        int fatorialNR = Calculadora_Aula35.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora_Aula35.fatorialRecursivo(5);
        System.out.println(fatorialR);

    }
}
