package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
   private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificavel() {
        return (int) getTotalDeAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return  "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
