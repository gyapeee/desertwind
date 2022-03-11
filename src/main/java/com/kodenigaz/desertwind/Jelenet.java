package com.kodenigaz.desertwind;

// com.kodenigaz.desertwind.Jelenet az absztraktja az osszes helyszinnek
abstract class Jelenet {
    public enum JelenetSzam {
        JELENET_1,
        JELENET_2,
        JELENET_3,
        JELENET_4,
        JELENET_5,
        JELENET_6,
    }

    int verzio;

    abstract void szoveg();

    abstract void parancs_Ertelmezo(String parancs);
}
