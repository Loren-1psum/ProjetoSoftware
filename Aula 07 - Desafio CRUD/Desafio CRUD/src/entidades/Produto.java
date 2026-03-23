package entidades;

public class Produto {
    private String nome;
    private double nota1;
    private double nota2;

    public Produto(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double mediaProduto(){
        return (this.nota1 + this.nota2)/2;
    }

    public String statusProduto(){
        if(mediaProduto() >= 7){
            return "Aprovado";
        }else if(mediaProduto() >= 5){
            return "Exame!";
        }else{
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return " | " + nome + " | " + nota1 + " | " + nota2 + " | " + mediaProduto() + " | " + statusProduto() + " | ";
    }

}
