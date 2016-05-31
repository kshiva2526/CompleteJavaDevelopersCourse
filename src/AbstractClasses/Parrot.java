package AbstractClasses;

/**
 * Created by robertsg on 5/31/2016.
 */
public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
