import java.util.ArrayList;
import java.util.List;

public class Musica {

    String titulo;
    String artista;
    String anoLancamento;
    List<Integer> avaliacao = new ArrayList<>();
    int numAvaliacoes;


    @Override
    public String toString() {
        return String.format(
                "Titulo: %s\n" +
                        "Artista: %s" +
                        "Lançamento: %s" +
                        "",
        );
    }
}
