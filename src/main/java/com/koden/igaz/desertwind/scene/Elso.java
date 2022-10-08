package com.koden.igaz.desertwind.scene;

import com.koden.igaz.desertwind.story.TortenetSzoveg;

// 1
public class Elso extends Verzio implements Jelenet {
    public Elso() {
        super();
    }

    public Elso(VerzioErtek verzio) {
        super(verzio);
    }

    @Override
    public String szoveg() {
        return TortenetSzoveg.HALAL;
    }

    @Override
    public void parancs_Ertelmezo(String parancs) {
        System.out.println(TortenetSzoveg.HALAL);
    }
}
