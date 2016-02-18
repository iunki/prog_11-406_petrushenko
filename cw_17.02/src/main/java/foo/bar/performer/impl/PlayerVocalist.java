package foo.bar.performer.impl;

import foo.bar.instrument.Instrument;
import foo.bar.performer.Performer;
import foo.bar.song.Song;

/**
 * Created by Юлия on 17.02.2016.
 */
public class PlayerVocalist implements Performer {

    private Song song;
    private Instrument instrument;

    PlayerVocalist(){}

    PlayerVocalist(Song song, Instrument instrument){
        this.song = song;
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        song.recite();
        instrument.play();
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
