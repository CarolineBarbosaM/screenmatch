package modelos;

import calculos.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    @Override
    public int getClassificavel() {
        if(totalAvaliacoes > 100) {
            return 3;
        }

        return 2;
    }
}
