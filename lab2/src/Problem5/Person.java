package Problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) { this.pet = pet; }
    public void removePet() { this.pet = null; }
    public boolean hasPet() { return pet != null; }
    public Animal getPet() { return pet; }
    public String getName() { return name; }

    public abstract String getOccupation();

   
    public void leavePetWith(Person caretaker) {
        if (this.hasPet()) {
            System.out.println(name + " оставляет " + pet.getName() + " у " + caretaker.getName());
            caretaker.assignPet(this.pet);
            this.removePet();
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            System.out.println(name + " забирает своего питомца обратно у " + caretaker.getName());
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