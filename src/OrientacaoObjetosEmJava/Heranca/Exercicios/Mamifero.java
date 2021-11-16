package OrientacaoObjetosEmJava.Heranca.Exercicios;

public class Mamifero extends Animal{

    private String alimento;
    public Mamifero() {
        this.setCor("castanho");
        this.alimento = "mel";


    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
