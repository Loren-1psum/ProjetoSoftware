public class Main {
    public static void main(String[] args) {

        Carro HB20 = new Carro();
        HB20.modelo = "HB20";
        HB20.marca = "Hyundai";
        HB20.ano = 2012;

        Carro HondaCivic = new Carro();
        HondaCivic.modelo = "Civic";
        HondaCivic.marca = "Honda";
        HondaCivic.ano = 2007;

        HB20.exibirInformacoes();
        HondaCivic.exibirInformacoes();
    }

}
