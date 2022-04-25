package com.kodenigaz.desertwind.scene;

import static com.kodenigaz.desertwind.story.TortenetSzoveg.HALAL;

// 1
public class Elso extends Verzio implements Jelenet {
    public Elso() {
        super();
    }

    public Elso(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public void szoveg() {
        System.out.println(HALAL);
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        System.out.println(HALAL);
    }
}
