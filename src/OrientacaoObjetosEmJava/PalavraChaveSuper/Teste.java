package OrientacaoObjetosEmJava.PalavraChaveSuper;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        //aluno e professor herdam as informacoes da classe Pessoa!


        aluno.setNome("Maria");
        aluno.getNome();
        aluno.getTelefoneCelular();

        professor.setNome("Maria");
        professor.getNome();
        professor.getTelefoneCelular();


        //aluno e professor herdam as informacoes da classe Pessoa!

    }
}
