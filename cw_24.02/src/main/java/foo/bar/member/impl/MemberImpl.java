package foo.bar.member.impl;

import foo.bar.member.Member;
import foo.bar.performer.Performer;
import foo.bar.song.Song;

import java.util.List;

public class MemberImpl implements Member {

    List<Performer> performers;

    List<Song> songs;

    String bandName;

    MemberImpl() {
    }

    MemberImpl(String bandName, List<Performer> performers, List<Song> songs) {
        this.bandName = bandName;
        this.performers = performers;
        this.songs = songs;
    }

    @Override
    public void act() {
        System.out.println("band name: " + bandName.toUpperCase());
        for (Song song : songs) {
            System.out.println("Song name: " + song.getName());
            for (Performer performer : performers) {
                performer.setSong(song);
                performer.perform();
            }
            System.out.println();
        }
        System.out.println("**********************");
    }

    public List<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(List<Performer> performers) {
        this.performers = performers;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
