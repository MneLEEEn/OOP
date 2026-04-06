package problem6;

import java.util.Objects;

public abstract class Person implements PetOwner, Comparable<Person>, Cloneable {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public abstract String getOccupation();

    // PetOwner implementation
    @Override
    public void assignPet(Animal pet) { this.pet = pet; }

    @Override
    public void removePet() { this.pet = null; }

    @Override
    public boolean hasPet() { return pet != null; }

    public Animal getPet() { return pet; }

    // Comparable
    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }

    // Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy достаточно
    }

    public void leavePetWith(Person caretaker) {
        if (this.hasPet()) {
            caretaker.assignPet(this.pet);
            this.removePet();
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            this.assignPet(caretaker.getPet());
            caretaker.removePet();
        }
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? ", Питомец: " + pet : ", Нет питомца";
        return name + " (" + getOccupation() + ", " + age + " лет)" + petInfo;
    }
}