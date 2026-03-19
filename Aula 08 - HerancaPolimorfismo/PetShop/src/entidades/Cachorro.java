package entidades;

public class Cachorro extends Animal{
    private String raca;

    //Constructor
    public Cachorro(String nome, double peso, int idade, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    //Getters & Setters

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + super.toString() +
                ", raca='" + raca + '\'' +
                '}';
    }
}
