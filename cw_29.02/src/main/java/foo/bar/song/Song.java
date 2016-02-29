package foo.bar.song;

/**
 * Created by Юлия on 17.02.2016.
 */
public class Song {

    private String name;
    private String text;

    public Song(){}

    public Song(String name, String text){
        this.name = name;
        this.text = text;
    }

    public void recite(){
        System.out.println("*singing: " + text + "*");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
