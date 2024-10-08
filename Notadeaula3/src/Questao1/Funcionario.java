package Questao1;

class Funcionario {
    String nome;
    int anoNasc;  // Ano de nascimento
    double salario;

    public Funcionario(String nome, int anoNasc, double salario) {
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: " + this.salario);
    }

    public int calcularIdade() {
        int anoAtual = 2024; // Definindo o ano atual como constante
        return anoAtual - this.anoNasc;
    }
}
