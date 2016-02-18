package foo.bar.performer.impl;

import foo.bar.performer.Performer;
import foo.bar.song.Song;

/**
 * Created by Юлия on 17.02.2016.
 */
public class Vocalist implements Performer {

    private Song song;

    Vocalist() {
    }

    Vocalist(Song song){
        this.song = song;
    }

    @Override
    public void perform() {
        song.recite();
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
