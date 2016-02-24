package foo.bar.instrument.impl;

import foo.bar.instrument.Instrument;

public class Drums implements Instrument {

    public Drums(){}

    @Override
    public void play() {
        System.out.println("*drums sound*");
    }
}
