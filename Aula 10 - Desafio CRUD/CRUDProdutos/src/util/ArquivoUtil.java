import java.io.FileWriter;
import java.io.IOException;

public void salvarArquivo(ArrayList<Produto> lista) {
    try {
        FileWriter writer = new FileWriter("produtos.txt");

        for (Produto p : lista) {
            writer.write(p.toString() + "\n");
        }

        writer.close();
        System.out.println("Salvo com sucesso!");

    } catch (IOException e) {
        System.out.println("Erro ao salvar arquivo");
    }
}