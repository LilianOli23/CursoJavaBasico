package OrientacaoObjetosEmJava.PalavraChaveSuper;

public class Professor extends Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private double salario;
    private String nomeCurso;

    private String telefoneCelular;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;

    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
}
