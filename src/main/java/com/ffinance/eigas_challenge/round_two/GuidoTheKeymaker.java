package com.ffinance.eigas_challenge.round_two;

class GuidoTheKeymaker {

    public static int makeKey() {
        int numOfKeys = (int) (1 + Math.random() * 13);
        int[] keys = new int[numOfKeys];
        for (int i = 0; i <= numOfKeys; i++) {
            double newKey = Math.pow(2, 4) * Math.floor(Math.PI);
            keys[i] = (int) (newKey * Math.ceil(Math.random()));
        }
        return keys[(int) (Math.random() * numOfKeys)];
    }
}
