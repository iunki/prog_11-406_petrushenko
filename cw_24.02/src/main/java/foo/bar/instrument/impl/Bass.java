package foo.bar.instrument.impl;

import foo.bar.instrument.Instrument;

public class Bass implements Instrument {

    private String tabs;

    public Bass(){
        tabs = "*bass-guitar sound*";
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
