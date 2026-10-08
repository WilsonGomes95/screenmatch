package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public double getSomaDasAvaliacao() {
        return somaDasAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }


    @Override
    public String toString() {
        return String.format("Nome do br.com.alura.screenmatch.modelos.Filme: %s\n" +
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
