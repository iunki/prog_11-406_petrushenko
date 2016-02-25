package foo.bar;

/**
 * Created by Руслан on 10.02.2016.
 */
public class Konferanse {

    Performer performer;

    public Konferanse(){}

    public Konferanse(Performer performer){
        this.performer = performer;
    }

    public void callToScene(){
        System.out.println("А сейчас на сцену выхоооодииииит!");
        performer.perform();
    }


}
