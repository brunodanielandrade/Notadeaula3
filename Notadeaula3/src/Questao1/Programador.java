package Questao1;

class Programador extends Funcionario {
    String linguagem;

    public Programador(String nome, int anoNasc, double salario, String linguagem) {
        super(nome, anoNasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem: " + this.linguagem);
    }
}
