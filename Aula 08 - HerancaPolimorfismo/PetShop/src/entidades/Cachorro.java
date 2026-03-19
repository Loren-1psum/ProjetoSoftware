package entidades;

public class Cachorro extends Animal{
    private String raca;

    //Constructor
    public Cachorro(String nome, double peso, int idade, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    //Getters & Setters

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
