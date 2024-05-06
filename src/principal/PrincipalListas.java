package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("As Crônicas de Nárnia", 2005);
        meuFilme.avalia(10);
        Filme novoFilme = new Filme("Harry Potter e a Camara Secreta", 1998);
        novoFilme.avalia(5);
        Filme outroFilme = new Filme("Donzela", 2024);
        outroFilme.avalia(1);
        Serie minhaSerie = new Serie("Arrow", 2012);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(novoFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);

        System.out.println("\n================ FAVORITOS ==================\n");

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getTotalDeAvaliacao() > 2) {
                System.out.println("Classificação: " + filme.getTotalDeAvaliacao());
            }
        }

        System.out.println("\n================ ARTISTAS ==================\n");
        ArrayList<String> artista = new ArrayList<>();

        artista.add("Taraji P. Henson");
        artista.add("Jennifer Aniston");
        artista.add("John Krasinski");

        System.out.println(artista);
        Collections.sort(artista);
        System.out.println(artista);

        System.out.println("\n================ TITULOS ORDENADOS ==================\n");

        System.out.println("\n----------------------- Ordenação por nome -----------------------\n");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("\n----------------------- Ordenação por ano de lançamento -----------------------\n");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
