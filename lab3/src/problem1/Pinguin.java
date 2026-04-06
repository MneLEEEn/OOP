package problem1;

public class Pinguin extends Animal {
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " is making a strange noise.");
    }
}

