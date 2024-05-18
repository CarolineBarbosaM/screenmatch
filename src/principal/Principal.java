package principal;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("================ FILMES ==================\n");
        Filme meuFilme = new Filme("As Crônicas de Nárnia", 2005);

        meuFilme.setDuracaoEmMinuto(150);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println("Media das avaliações: " + meuFilme.obterMedia() + "\n");

        Filme novoFilme = new Filme("Harry Potter e a Camara Secreta", 1998);
        novoFilme.setDuracaoEmMinuto(161);

        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(10);
        novoFilme.avalia(7);
        novoFilme.avalia(9);
        novoFilme.avalia(5);
        novoFilme.avalia(5);

        System.out.println("Total de avaliações: " + novoFilme.getTotalDeAvaliacao());
        System.out.println("Media das avaliações: " + novoFilme.obterMedia());

        System.out.println("\n================ SERIES ==================\n");

        Serie minhaSerie = new Serie("Arrow", 2012);

        minhaSerie.exibeFichaTecnica();

        minhaSerie.setTemporadas(8);
        System.out.println("Temporadas: " + minhaSerie.getTemporadas());

        minhaSerie.setEpisodiosPorTemporada(21);
        minhaSerie.setMinutosPorEpisodio(40);

        System.out.println("Duração da maratona (minutos): " + minhaSerie.getDuracaoEmMinuto());

        System.out.println("\n================ CALCULADORA ==================\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(novoFilme);
        calculadora.inclui(minhaSerie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal() + "\n");

        System.out.println("\n================ RECOMENDAÇÃO ==================\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println(novoFilme.getNome());
        filtro.filtra(novoFilme);

        System.out.println("\n================ EPISODIOS ==================\n");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalAvaliacoes(300);
        filtro.filtra(episodio);

        System.out.println("\n================ FILMES DISPONIVEIS ==================\n");
        Filme outroFilme = new Filme("Donzela", 2024);
        outroFilme.setDuracaoEmMinuto(170);

        ArrayList<Filme> todosFilmes = new ArrayList<>();
        todosFilmes.add(meuFilme);
        todosFilmes.add(novoFilme);
        todosFilmes.add(outroFilme);

        System.out.println("Total de filmes Disponiveis: " + todosFilmes.size());
        System.out.println("Primeiro filme da lista: " + todosFilmes.get(0).getNome());
        System.out.println(todosFilmes);

    }
}