package Questao2;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Mimi", "Siames");
        gato.caminha();
        gato.mia();
    }
}