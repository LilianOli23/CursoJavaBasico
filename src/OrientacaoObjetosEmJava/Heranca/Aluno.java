package OrientacaoObjetosEmJava.Heranca;

public class Aluno extends Pessoa{


    private String curso;
    private double[] notas;

    private String telefoneCelular;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
