package Questao1;

class Gerente extends Funcionario {
    String projeto;

    public Gerente(String nome, int anoNasc, double salario, String projeto) {
        super(nome, anoNasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto: " + this.projeto);
    }
}