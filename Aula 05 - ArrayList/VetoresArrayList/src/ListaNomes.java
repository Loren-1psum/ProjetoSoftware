import java.util.ArrayList;

public class ListaNomes {
    static void main (){
        ArrayList<String> listaNomes = new   ArrayList<>();

        listaNomes.add("Pedro");
        listaNomes.add("João");
        listaNomes.add("Caio");
        listaNomes.add("Ryan");
        listaNomes.add("Maria");
        listaNomes.add("Maria");

        //Funcao anonima
        //Remover valores iguais a "Maria"
        listaNomes.removeIf(nome -> nome.equals("Maria"));

        //Remover a partir de uma letra
        listaNomes.removeIf(nome ->nome.contains("r"));

        for (String nome : listaNomes) {
            System.out.println(nome);
        }



    }
}
