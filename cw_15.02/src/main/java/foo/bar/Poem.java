package foo.bar;

public class Poem {

    String text;

    public Poem() {
    }

    public Poem(String text) {
        this.text = text;
    }

    public void recite() {
        System.out.println(text);
    }

}
