package OrientacaoObjetosEmJava.ModificadoresDeAcesso;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.capCombustivel = 30;
        carro.numPassageiros = 4;

        System.out.println("Marca do carro: " + carro.marca);
        System.out.println("Capacidade de combustivel: "+ carro.capCombustivel);
        System.out.println("Capacidade de passageiros: " + carro.numPassageiros);

    }

}