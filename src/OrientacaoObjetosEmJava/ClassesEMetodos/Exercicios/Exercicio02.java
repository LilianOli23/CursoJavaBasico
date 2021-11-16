package OrientacaoObjetosEmJava.ClassesEMetodos.Exercicios;

public class Exercicio02 {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Autor do livro = " + livro.autor);
        System.out.println("Ano de lançamento do livro = " + livro.anoLancamento);

    }
}
