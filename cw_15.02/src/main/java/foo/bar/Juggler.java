package foo.bar;

public class Juggler implements Performer {

    int countOfBeanbags;

    String name;

    Poem poem = null;

    public Juggler() {
    }

    public Juggler(int countOfBeanbags) {
        this.countOfBeanbags = countOfBeanbags;
    }

    public Juggler(int countOfBeanbags, Poem poem) {
        this.countOfBeanbags = countOfBeanbags;
        this.poem = poem;
    }

    public void perform() {
        System.out.println("*жонглирует " + countOfBeanbags + " кеглями*");
        poem.recite();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfBeanbags() {
        return countOfBeanbags;
    }

    public void setCountOfBeanbags(int countOfBeanbags) {
        this.countOfBeanbags = countOfBeanbags;
    }

    public Poem getPoem() {
        return poem;
    }

    public void setPoem(Poem poem) {
        this.poem = poem;
    }
}
