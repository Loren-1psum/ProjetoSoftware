package entidades;

public class Peixe extends Animal{
    private String especie;

    //Constructor
    public Peixe(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);
        this.especie = especie;
    }

    //Getters & Setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
