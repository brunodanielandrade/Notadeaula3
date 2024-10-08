package Questao2;

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void late() {
        System.out.println(getNome() + " está latindo.");
    }
}