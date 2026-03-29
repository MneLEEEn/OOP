package bonus;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 4, 1, 2, 0, 5, 3, 2};

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("\nCounting Sort Result:");
        CountingSort.countingSort(numbers);
    }
}
