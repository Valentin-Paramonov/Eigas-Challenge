package com.ffinance.eigas_challenge.round_four;

/**
 * <p>In this round you have to kiss the sleeping beauty, maybe she has the answer?
 * But beware, there's an ugly witch around here somewhere!</p>
 */
public class RoundFour {

    static Maiden sleepingBeauty = new SleepingBeauty();

    public static void main(String[] args) {
        System.out.println("The answer to round four is " + answer());
    }

    public static String answer() {
        return ((Princess) sleepingBeauty).kiss();
    }
}
