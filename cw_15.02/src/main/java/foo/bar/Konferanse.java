package foo.bar;

import java.util.Collection;

public class Konferanse {

    Collection<Performer> performers;

    public Konferanse() {
    }

    public void callToScene() {
        for (Performer performer : performers) {
            System.out.println(performer.getName() + ": ");
            performer.perform();
        }
    }

    public Collection<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(Collection<Performer> performers) {
        this.performers = performers;
    }
}
