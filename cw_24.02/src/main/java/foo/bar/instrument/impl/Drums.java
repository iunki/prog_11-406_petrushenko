package foo.bar.instrument.impl;

import foo.bar.instrument.Instrument;

public class Drums implements Instrument {

    private String tabs;

    public Drums(){
        tabs = "*drums sound*";
    }

    @Override
    public void play() {
        System.out.println(tabs);
    }

    @Override
    public String getTabs() {
        return tabs;
    }

    public void setTabs(String tabs) {
        this.tabs = tabs;
    }
}

