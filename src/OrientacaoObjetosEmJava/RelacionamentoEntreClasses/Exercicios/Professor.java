package OrientacaoObjetosEmJava.RelacionamentoEntreClasses.Exercicios;

public class Professor {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String nome;
    private String departamento;
    private String email;

    public String obterInfo() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
