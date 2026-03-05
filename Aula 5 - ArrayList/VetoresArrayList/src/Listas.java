import java.util.ArrayList;

public class Listas {
    public static void main (String[] args) {
        ArrayList<Integer> listasNotas = new ArrayList<>();

        //Adicionar Valores
        listasNotas.add(10);
        listasNotas.add(9);
        listasNotas.add(8);
        listasNotas.add(4);
        System.out.println(listasNotas);

        //Adicionar Valores em uma posicao especifica
        listasNotas.add(2 , 3);
        listasNotas.add(4 , 5);
        System.out.println(listasNotas);

        //Verificar o tamnho da lista
        System.out.println("O tamanho da lista é" + listasNotas.size());

        //Acessar um elemento da lista
        System.out.println("A segunda posição tem valor" + listasNotas.get(1));

        //Alterar um valor da lista
        listasNotas.set(0, 20);
        System.out.println(listasNotas);

        //Encontrar a posição pelo valor
        listasNotas.indexOf(20);

        //Remover
        listasNotas.remove(1); //Posição
        listasNotas.remove(listasNotas.indexOf(20)); //Peço valor

        //Remover a partir de uma função lambda
        listasNotas.removeIf(element -> element < 7);
        System.out.println(listasNotas);

        for(Integer nota : listasNotas){
            System.out.println();
        }


    }
}
