package problem1;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " is roaring.");
    }
}
