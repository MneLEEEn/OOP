package problem4;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee("Alice", 50000, new Date(), "NI123");
        Employee e2 = new Employee("Bob", 60000, new Date(), "NI456");

        Manager m1 = new Manager("Charlie", 70000, new Date(), "NI789", 5000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        Manager m2 = new Manager("David", 70000, new Date(), "NI999", 3000);

        // toString
        System.out.println(e1);
        System.out.println(m1);

        // equals
        System.out.println("e1 equals e2? " + e1.equals(e2));

        // Comparable
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);
        list.add(m2);

        Collections.sort(list);
        System.out.println("\nSorted by salary:");
        list.forEach(System.out::println);

        // Sort by name
        Collections.sort(list, new EmployeeNameComparator());
        System.out.println("\nSorted by name:");
        list.forEach(System.out::println);

        // Sort by hire date
        Collections.sort(list, new EmployeeHireDateComparator());
        System.out.println("\nSorted by hire date:");
        list.forEach(System.out::println);

        // Clone test
        Manager cloned = (Manager) m1.clone();
        System.out.println("\nCloned manager:");
        System.out.println(cloned);
    }
}