package com.ffinance.eigas_challenge.round_five.answer;

import com.ffinance.eigas_challenge.Decoder;

public class AnswerObtainedException extends Exception {

    int[] code = { 1396, 1356, 1355, 1372, 1367, 1368, 1305, 1366, 1375, 1305, 1357, 1361, 1372, 1305, 1405, 1372, 1372, 1353 };

    protected AnswerObtainedException() {
    }

    public String getAnswer() {
        return Decoder.decode(code, 1337);
    }
}
