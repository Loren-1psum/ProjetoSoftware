import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Max", 1 , 2, "Pug");
        Gato gato = new Gato("Gato", 2, 4, "Marrom");
        Peixe peixe = new Peixe("Peixe", 1, 0.005, "Betta");
    }
}
