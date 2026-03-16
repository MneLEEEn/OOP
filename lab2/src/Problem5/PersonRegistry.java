package Problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--- Реестр Системы ---\n");
        for (Person p : people) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}