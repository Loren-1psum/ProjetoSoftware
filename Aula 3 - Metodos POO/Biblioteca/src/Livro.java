public class Livro {
    String titulo;
    String autor;
    int qtd;
    double valorLivro;

    //Construtor
    public  Livro(String titulo, String autor, int qtd, double valorLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtd = qtd;
        this.valorLivro = valorLivro;
    }

    //Metodo Emprestar Livro
    public void emprestarLivro(int quantidade){
        if (quantidade > 0 && quantidade <= this.qtd){
            this.qtd =  this.qtd - quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    //Metodo Devolver Livro
    public void devolverLivro(int quantidade){
        if (quantidade > 0){
            this.qtd += quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");
        }
    }

    public double valorTotal(){
        double valorTotal = this.valorLivro * this.qtd;
        return valorTotal;
    }

    //Exibir as Informações do Livro
    public void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nQuantidade: " + this.qtd +
                "\nValor do Livro R$: " + this.valorLivro +
                "\nValor Total: R$ " + valorTotal()
        );
    }
}
