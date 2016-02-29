package foo.bar.instrument.impl;

import foo.bar.instrument.Instrument;

public class Guitar implements Instrument {

    public Guitar(){}

    @Override
    public void play() {
        System.out.println("*guitar sound*");
    }
}
