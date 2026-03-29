package bonus;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int[] count = new int[11]; 

        for (int num : arr) {
            count[num]++;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}