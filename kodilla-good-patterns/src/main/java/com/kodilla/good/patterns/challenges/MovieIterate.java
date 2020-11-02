package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;

class MovieIterate {
    public static void iterate(Map<String, List<String>> mapToIterate) {
        mapToIterate.values().stream()
                .flatMap(Collection::stream)
                .forEach(e -> System.out.print(e + "!"));
    }

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        iterate(movieStore.getMovies());
    }


}
