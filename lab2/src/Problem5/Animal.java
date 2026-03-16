package Problem5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();
    
    public String getName() { return name; }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " (Звук: " + getSound() + ")";
    }
}


class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Мяу"; }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Гав"; }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Чирик"; }
}