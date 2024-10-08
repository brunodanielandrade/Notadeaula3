package Questao2;

class Animal {
    private String nome;
    private String raca;

    public Animal() {
        this.nome = "Sem nome";
        this.raca = "Sem raça";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Sem raça";
    }

    // Construtor com nome e raça como parâmetros
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println(this.nome + " está caminhando.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}