package com.ffinance.eigas_challenge.round_one;

/**
 * <p>In this round you need to prove that you're even worthy to be considered for the challenge.</p>
 * <p>Calculate the incalculable or run away while you still can, kid!</p>
 */
public class RoundOne {

    static int mysterious;

    static int delirious;

    static int unthinkable;

    public static void main(String[] args) {
        System.out.println("The answer to round one is " + answer());
    }

    public static int answer() {
        return incalculable();
    }

    static int incalculable() {
        delirious = (int) Math.pow(3600 + 500 - 200 + 15000 / unthinkable, 0);
        mysterious = (int) Math.sqrt(Math.sin(Math.PI / 2) * Math.log(Math.E) + Math.exp(0) + Math.cbrt(8));
        unthinkable = (int) Math.log1p(Math.PI * Math.E);
        return (int) (1000000 * Math.log(Math.asin(Math.sqrt(2) / 2) * (mysterious / delirious)));
    }
}
