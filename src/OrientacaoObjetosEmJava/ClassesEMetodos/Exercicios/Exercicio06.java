package OrientacaoObjetosEmJava.ClassesEMetodos.Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av. Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-2345";
        contato1.telefones[1] = "99999-2312";
        contato1.telefones[2] = "99999-2367";

        System.out.println("Dados de contato do Joao:");
        System.out.println(contato1.nome);
        System.out.println(contato1.endereco);
        System.out.println(contato1.email);
        System.out.println(contato1.telefones[0]);
        System.out.println(contato1.telefones[1]);
        System.out.println(contato1.telefones[2]);
    }
}
