package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Be or not to be", ((textToBeautify) -> "ABC " + textToBeautify));
        poemBeautifier.beautify("You know nothing, ", ((textToBeautify) -> textToBeautify + "John Snow"));
        poemBeautifier.beautify("wheat india pale ale", (textToBeautify -> textToBeautify.toUpperCase()));
        poemBeautifier.beautify("BE QUIET!!! ", (textToBeautify -> textToBeautify.toLowerCase() + "Please."));
        poemBeautifier.beautify("lalala", (textToBeautify -> textToBeautify.substring(2, 4) + " compañera"));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
