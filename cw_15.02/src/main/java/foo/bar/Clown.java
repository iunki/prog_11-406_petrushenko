package foo.bar;

public class Clown implements Performer {

    String name;

    public Clown() {
    }

    public Clown(String name) {
        this.name = name;
    }

    @Override
    public void perform() {
        System.out.println("Тут могла быть шутка");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
