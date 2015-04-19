package com.ffinance.eigas_challenge.round_three;

class Sword implements SwordPart {

    String spell;

    public String hit(BeastlyDragon dragon) {
        return dragon.getHit(spell);
    }
}
