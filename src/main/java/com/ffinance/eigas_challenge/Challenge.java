package com.ffinance.eigas_challenge;

import com.ffinance.eigas_challenge.eiga.EigasWisdom;
import com.ffinance.eigas_challenge.eiga.WrongAnswerException;
import com.ffinance.eigas_challenge.round_five.RoundFive;
import com.ffinance.eigas_challenge.round_four.RoundFour;
import com.ffinance.eigas_challenge.round_one.RoundOne;
import com.ffinance.eigas_challenge.round_three.RoundThree;
import com.ffinance.eigas_challenge.round_two.RoundTwo;

/**
 * <p>Greetings, Stranger!</p>
 * <p>You think you're worthy enough to be called a true Exception-Wielder?<br>
 * Let's see if you can put your confidence where your mouth is!<br>
 * I, Great Eiga, have prepared a challenge for you to take on.</p>
 * <p>The challenge  consists of five rounds. Each round will test your knowledge about Java Exceptions.<br>
 * Complete all of them and you'll get to know something new about yourself;<br>
 * Fail and be laughed upon through the rest of your miserable life!<br></p>
 * <p>Still want to proceed? Well then, open the command line and type in<br>
 * "./gradlew challenge" or "gradlew.bat challenge" depending on your platform.<br></p>
 * <p> Let the challenge begin!</p>
 */
public class Challenge {

    public static void main(String[] args) {
        System.setProperty("round.one.answer", String.valueOf(RoundOne.answer()));
        System.setProperty("round.two.answer", String.valueOf(RoundTwo.answer()));
        System.setProperty("round.three.answer", String.valueOf(RoundThree.answer()));
        System.setProperty("round.four.answer", String.valueOf(RoundFour.answer()));
        System.setProperty("round.five.answer", String.valueOf(RoundFive.answer()));
        try {
            System.out.println("Congratulations, you've completed the challenge! Here's a prophecy from Great Eiga!\nEiga: " + EigasWisdom.hear());
        } catch (WrongAnswerException wae) {
            System.out.println("Oh-oh, " + wae.getMessage());
        }
    }
}