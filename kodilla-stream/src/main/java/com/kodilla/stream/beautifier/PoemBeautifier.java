package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String poeticFragment, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(poeticFragment);
        System.out.println("Result equals: " + result);
    }
}
