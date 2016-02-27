package foo.bar.performer.impl;

import foo.bar.instrument.Instrument;
import foo.bar.performer.Performer;
import foo.bar.song.Song;

public class Player implements Performer {

    Instrument instrument;

    Player(){}

    Player(Instrument instrument){
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        instrument.play();
    }

    @Override
    public void setSong(Song song) {

    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
