public class Main {
    public static void main(String[] args) {

        Lanche xEgg = new Lanche();
        xEgg.nome = "X-Egg";
        xEgg.preco = 500.0;
        xEgg.descricao = "Pão, Maionese, Ovo, Hamburger, Queijo";

        Lanche xDogao = new Lanche();
        xDogao.nome = "Dogão";
        xDogao.preco = 50.0;
        xDogao.descricao = "Salsicha, Batata Palha, Molho Rose, Pão, Purê de Batata, Vinagrete";

        xEgg.exibir();
        xDogao.exibir();
    }
}
