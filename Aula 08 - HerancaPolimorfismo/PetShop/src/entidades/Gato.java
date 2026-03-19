package entidades;

public class Gato extends Animal{
    private String cor;

    //Constructor
    public Gato(String nome, double peso, int idade, String cor) {
        super(nome, idade, peso);
        this.cor = cor;
    }

    //Getters & Setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
