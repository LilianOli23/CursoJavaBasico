package OrientacaoObjetosEmJava.RelacionamentoEntreClasses.Exercicios;

import java.util.Arrays;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the contatos
     */
    public Contato[] getContatos() {
        return contatos;
    }

    /**
     * @param contatos the contatos to set
     */
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", contatos=" + Arrays.toString(contatos) +
                '}';
    }
}