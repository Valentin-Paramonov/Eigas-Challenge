package com.ffinance.eigas_challenge;

import java.util.Arrays;

public class Decoder {

    public static String decode(int[] code, int key) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(code)
              .map(i -> i ^ key)
              .forEach(i -> builder.append((char) i));
        return builder.toString();
    }
}
