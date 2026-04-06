package problem5;
public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 45),
                new Chocolate("Snickers", 60)
        };

        Sort.bubbleSort(chocolates);
        System.out.println("Chocolates sorted:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(10, 30),
                new Time(9, 45),
                new Time(10, 15)
        };

        Sort.mergeSort(times);
        System.out.println("\nTimes sorted:");
        for (Time t : times) {
            System.out.println(t);
        }

        Employee[] employees = {
                new Employee("Alice", 50000, new java.util.Date(), "NI1"),
                new Employee("Bob", 60000, new java.util.Date(), "NI2")
        };

        Sort.bubbleSort(employees);
        System.out.println("\nEmployees sorted:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}