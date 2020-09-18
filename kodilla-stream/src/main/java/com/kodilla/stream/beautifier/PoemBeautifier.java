package com.kodilla.stream.beautifier;


public class PoemBeautifier {
    public void decorate(String tekst, PoemDecorator poemDecorator) {
        String upper = poemDecorator.beautify(tekst);
        System.out.println(upper);
    }
}