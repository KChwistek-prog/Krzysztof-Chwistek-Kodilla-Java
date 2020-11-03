package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class MovieIterate {
    public static void iterate(Map<String, List<String>> mapToIterate) {
        String resultStream = mapToIterate.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        System.out.println(resultStream);
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        iterate(movieStore.getMovies());
    }
}
