package com.kodilla.good.patterns.challenges.movie;

import com.kodilla.good.patterns.challenges.movie.MovieStore;

import java.util.stream.Collectors;

public class MovieStoreStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String allMoviesNames = movieStore.getMovies().entrySet().stream()
                .flatMap(l -> l.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(allMoviesNames);
    }
}
