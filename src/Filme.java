public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;


    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return String.format("Nome do Filme: %s\n" +
        "Ano de Lançamento: %d\n"
        , nome, anoDeLancamento);
    }

    public void avalia(double avaliacao){
        if (avaliacao > 0 && avaliacao <= 10) {
            this.somaDasAvaliacao += avaliacao;
            totalDeAvaliacoes++;
        }
    }

    public double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }

}
