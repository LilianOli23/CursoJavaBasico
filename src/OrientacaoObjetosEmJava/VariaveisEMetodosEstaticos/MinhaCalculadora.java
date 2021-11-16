package OrientacaoObjetosEmJava.VariaveisEMetodosEstaticos;

public class MinhaCalculadora {


    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }
    public static double potencia(double num1, double num2){
        return Math.pow(num1,num2);

    }
    public static int fatorial(int num){

        if (num == 0){
            return 1;
        }

        int total = 1;
        for (int i=num; i>1; i--){
            total *= i;
        }

        return total;
    }
}
