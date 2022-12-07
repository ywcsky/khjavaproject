package com.kh.day10.musicinterface;

public class StageRun {
    public static void main(String[] args) {
        Musician mu = new Musician();
        mu.playInstrument(new Piano());
        mu.playInstrument(new Drum());
        mu.playInstrument(new Guitar());
    }
}
