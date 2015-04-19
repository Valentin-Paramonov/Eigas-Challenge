package com.ffinance.eigas_challenge.round_three;

class Blacksmith {

    public static Sword forgeSword() {
        return assembleSword();
    }

    static Sword assembleSword() {
        return grip().attach(guard())
                     .attach(blade())
                     .assemble();
    }

    private static SwordPart blade() {
        return new Blade();
    }

    private static SwordPart guard() {
        return new Guard();
    }

    private static SwordPart grip() {
        return new Grip();
    }
}
