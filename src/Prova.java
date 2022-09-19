import java.util.Scanner;

public class Prova {
    Aluno aluno;
    Questao q1;
    Questao q2;
    Questao q3;
    Questao q4;
    Questao q5;

    private int resposta1;
    private int resposta2;
    private int resposta3;
    private int resposta4;
    private int resposta5;

    private int nota;

    public Prova(Aluno aluno, Questao q1 , Questao q2 , Questao q3 , Questao q4 , Questao q5){
        this.aluno = aluno;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
    }

    void aplicarProva(){
        System.out.println("Digite a resposta");
        Scanner leitor = new Scanner(System.in);
        q1.mostrar();
        resposta1 = leitor.nextInt();

        q2.mostrar();
        resposta2 = leitor.nextInt();

        q3.mostrar();
        resposta3 = leitor.nextInt();

        q4.mostrar();
        resposta4 = leitor.nextInt();

        q5.mostrar();
        resposta5 = leitor.nextInt();

    }

    void corrigir(){
        if(q1.estaCorreta(resposta1)) nota++;
        if(q2.estaCorreta(resposta2)) nota++;
        if(q3.estaCorreta(resposta3)) nota++;
        if(q4.estaCorreta(resposta4)) nota++;
        if(q5.estaCorreta(resposta5)) nota++;

        System.out.println("A nota do aluno foi: "+nota);
    }
}
