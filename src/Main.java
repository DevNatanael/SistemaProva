import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = scanner.next();

        System.out.println("Digite a idade do aluno");
        int idade = scanner.nextInt();

        System.out.println("Digite a matrícula do aluno");
        String matricula = scanner.next();

        Aluno aluno = new Aluno(nome, matricula,idade );
        aluno.mostrar();

        Questao q1 = new Questao("teste1", "um", "dois", "tres", "quatro" , 2);
        Questao q2 = new Questao("teste1", "um", "dois", "tres", "quatro" , 1);
        Questao q3 = new Questao("teste1", "um", "dois", "tres", "quatro" , 3);
        Questao q4 = new Questao("teste1", "um", "dois", "tres", "quatro" , 4);
        Questao q5 = new Questao("teste1", "um", "dois", "tres", "quatro" , 2);

        Prova prova = new Prova(aluno, q1, q2, q3, q4, q5);
        prova.aplicarProva();
        prova.corrigir();
    }
}