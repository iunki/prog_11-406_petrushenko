package foo.bar.instrument.impl;

import foo.bar.instrument.Instrument;

public class Bass implements Instrument {

    public Bass(){}

    @Override
    public void play() {
        System.out.println("*bass-guitar sound*");
    }
}
