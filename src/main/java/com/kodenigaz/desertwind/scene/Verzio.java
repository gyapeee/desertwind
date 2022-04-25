package com.kodenigaz.desertwind.scene;

abstract public class Verzio {
    public enum VerzioErtek {
        VERZIO_0,
        VERZIO_1
    }

    protected VerzioErtek verzio;

    protected Verzio() {
        this.verzio = VerzioErtek.VERZIO_0;
    }

    public Verzio(VerzioErtek verzio) {
        this.verzio = verzio;
    }

    public VerzioErtek getVerzio() {
        return verzio;
    }

    public void setVerzio(VerzioErtek verzio) {
        this.verzio = verzio;
    }
}
