package Questao1;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos Silva", 1980, 8000.00, "Projeto A");
        gerente.informarSalario();
        gerente.informarProjeto();
        System.out.println("Idade do gerente: " + gerente.calcularIdade());


        Programador programador = new Programador("Ana Souza", 1995, 6000.00, "Java");
        programador.informarSalario();
        programador.informarLinguagem();
        System.out.println("Idade do programador: " + programador.calcularIdade());
    }
}