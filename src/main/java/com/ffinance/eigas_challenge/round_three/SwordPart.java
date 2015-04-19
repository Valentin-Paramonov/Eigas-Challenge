package com.ffinance.eigas_challenge.round_three;

import java.util.UUID;

interface SwordPart {

    default SwordPart attach(SwordPart part) {
        return part;
    }

    default Sword assemble() {
        Sword sword = new Sword();
        sword.spell = UUID.randomUUID()
                          .toString();
        System.setProperty("dragonSpell", sword.spell);
        System.setProperty("d" + "ragon" + "K" + "ey", "69");
        return sword;
    }
}
