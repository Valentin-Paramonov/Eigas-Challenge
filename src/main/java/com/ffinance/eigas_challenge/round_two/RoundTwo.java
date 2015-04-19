package com.ffinance.eigas_challenge.round_two;

import com.ffinance.eigas_challenge.Decoder;

/**
 * <p>In this round you need to help Guido the Keymaker to make a key for you to pass onward!
 * Looks like he's having a problem...</p>
 * <p>Do you have what it takes to carry on?</p>
 */
public class RoundTwo {

    private static int[] code = new int[]{ 114, 85, 92, 69, 87, 81 };

    public static void main(String[] args) {
        System.out.println("The answer to round two is " + answer());
    }

    public static String answer() {
        /**
         * I wouldn't recommend you to touch this method, the problem lies elsewhere
         */
        int key = GuidoTheKeymaker.makeKey();
        return Decoder.decode(code, key);
    }
}
