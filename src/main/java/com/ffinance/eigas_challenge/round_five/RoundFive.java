package com.ffinance.eigas_challenge.round_five;

import com.ffinance.eigas_challenge.round_five.answer.AnswerObtainedException;

/**
 * <p>This is the final challenge! Never thought you would get this far.
 * Jokes on me! Welp, none of that matters, since you will never get through this one, kid!</p>
 * <p>Dive into the Dark Abyss and emerge with the answer, or never emerge at all! Ha! Ha! Ha! Ha! Cough, cough, cough...</p>
 */
public class RoundFive {

    public static void main(String[] args) {
        System.out.println("The answer to round five is " + answer());
    }

    public static String answer() {
        try {
            DarkAbyss.diveIn();
        } catch (AnswerObtainedException aoe) {
            return aoe.getAnswer();
        }
        return "The answer remains unknown";
    }
}
