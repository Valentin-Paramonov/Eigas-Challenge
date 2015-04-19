package com.ffinance.eigas_challenge.round_three;

import com.ffinance.eigas_challenge.Decoder;

class BeastlyDragon {

    private int[] code = new int[]{ 22, 50, 42, 55, 33, 35, 44, 54, 45 };

    public String getHit(String spell) {
        if (System.getProperty("dragonSpell")
                  .equals(spell)) {
            return Decoder.decode(code, Integer.valueOf(System.getProperty("dragonKey")));
        }
        return "Rooooaarrr!!!";
    }
}
