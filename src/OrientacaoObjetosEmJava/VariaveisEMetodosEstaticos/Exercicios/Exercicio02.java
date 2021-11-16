package OrientacaoObjetosEmJava.VariaveisEMetodosEstaticos.Exercicios;

import OrientacaoObjetosEmJava.VariaveisEMetodosEstaticos.MinhaCalculadora;

public class Exercicio02 {

    public static void main(String[] args) {

        imprimirTela(MinhaCalculadora.soma(1,2));
        imprimirTela(MinhaCalculadora.subtracao(1,2));
        imprimirTela(MinhaCalculadora.divisao(1,2));
        imprimirTela(MinhaCalculadora.multiplicacao(1,2));
        imprimirTela(MinhaCalculadora.potencia(1,2));

    }
    static void imprimirTela(double num){
        System.out.println(num);
    }
}
