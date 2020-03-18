package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(7, 1.5);
        } catch (Exception e) {
            System.out.println("Here is some exception: " + e);
        } finally {
            System.out.println("Done!");
        }
    }
}
