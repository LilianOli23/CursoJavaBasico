package OrientacaoObjetosEmJava.ClassesEMetodos.MetodosSimples;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é de: " + capCombustivel * consumoCombustivel + "km");

    }
}
