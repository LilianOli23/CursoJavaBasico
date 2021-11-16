package OrientacaoObjetosEmJava.RelacionamentoEntreClasses.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o horario do curso: ");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProfessor = scan.nextLine();

        System.out.println("Entre com o email do professor: ");
        String email = scan.nextLine();

        System.out.println("Entre com o departamento do professor: ");
        String departamento = scan.nextLine();

        Curso curso = new Curso();

        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(departamento);
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("--Alunos--");

        Aluno[] alunos = new Aluno[5];
        for(int i=0; i<5; i++){
            System.out.println("Entre com o nome do aluno: ");
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do aluno: ");
            String matriculaAluno = scan.nextLine();

            System.out.println("Entre com as notas do aluno: ");
            String notasAluno = scan.nextLine();

            double[] notas = new double[4];

            for(int j=0; j<4; j++){
                System.out.println("Entre com a nota" + (j+1));
                notas[j] = scan.nextDouble();
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

        }
        curso.setAlunos(alunos);

    }
}
