public class Questao {
    public String enunciado;
    public String resposta1;
    public String resposta2;
    public String resposta3;
    public String resposta4;

    private int gabarito;

    public Questao(String enunciado,String resposta1,String resposta2,String resposta3,String resposta4, int respostaCorreta){
        this.enunciado = enunciado;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.gabarito = respostaCorreta;
    }

    boolean estaCorreta(int respostaCerta){
        if(respostaCerta == gabarito){
            return true;
        }else{
            return false;
        }
    }

    void mostrar(){
        System.out.println("Enunciado: "+enunciado);
        System.out.println("1: "+resposta1);
        System.out.println("2: "+resposta2);
        System.out.println("3: "+resposta3);
        System.out.println("4: "+resposta4);
    }
}
