package com.ffinance.eigas_challenge.round_three;

/**
 * <p>In this round you have to defeat the Beastly Dragon!
 * He's got the answer, can you get it out of him?</p>
 */
public class RoundThree {

    static BeastlyDragon dragon = new BeastlyDragon();

    public static void main(String[] args) {
        System.out.println("The answer to round three is " + answer());
    }

    public static String answer() {
        Sword sword = Blacksmith.forgeSword();
        return sword.hit(dragon);
    }
}
