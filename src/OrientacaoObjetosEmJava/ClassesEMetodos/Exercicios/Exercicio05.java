package OrientacaoObjetosEmJava.ClassesEMetodos.Exercicios;

public class Exercicio05 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "12345";
        conta.agencia= "11111";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
    }
}
