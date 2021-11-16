package OrientacaoObjetosEmJava.SobrecargaMetodosConstrutores;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();
        int a;
        double b;

        a = calc.soma(1, 2);
        b = calc.soma(1.2,2.2);


        System.out.println(a);
        System.out.println(b);

    }
}
