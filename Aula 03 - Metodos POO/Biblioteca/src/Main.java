public class Main {
    public static void main(String[] args) {
        Livro harryPotter = new Livro("Harry Potter- Pedra Fisolofal" , "J. K. Rowling" , 500 , 69.90);

        Livro senhorDosAneis = new Livro("O Senhor dos Aneis: A Sociedade do Anel" , "J. R. R. Tolkien" , 10 , 89.90 );

        harryPotter.emprestarLivro(20);
        harryPotter.devolverLivro(17);

        harryPotter.exibirInformacoes();
        senhorDosAneis.exibirInformacoes(); 
    }
}
