package OrientacaoObjetosEmJava.MetodosGetSet;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.setMarca("Fiat");
        van.setCapCombustivel(30);
        van.setConsumoCombustivel(2.0);
        van.setModelo("Uno");
        van.setNumPassageiros(4);

        System.out.println(van.getMarca());
        System.out.println(van.getCapCombustivel());
        System.out.println(van.getModelo());
        System.out.println(van.getConsumoCombustivel());
        System.out.println(van.getNumPassageiros());

    }

}
