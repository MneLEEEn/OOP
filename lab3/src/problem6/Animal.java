package problem6;

public abstract class Animal implements Soundmaker, Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    @Override
    public int compareTo(Animal other) {
        return this.age - other.age; // сравнение по возрасту
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name +
                " (Звук: " + getSound() + ", возраст: " + age + ")";
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
}