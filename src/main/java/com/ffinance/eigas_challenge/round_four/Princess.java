package com.ffinance.eigas_challenge.round_four;

import com.ffinance.eigas_challenge.Decoder;

public class Princess implements Maiden {

    @Override
    public String kiss() {
        return Decoder.decode(new int[]{ 85, 123, 98, 114, 112, 126, 123, 123 }, Integer.valueOf(System.getProperty("princessKey")));
    }
}
