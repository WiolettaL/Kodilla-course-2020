package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3,0);
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("The exception is here: " + ae);
        } finally {
            System.out.println("done");
        }
    }
}
