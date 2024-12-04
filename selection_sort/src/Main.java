import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex == i) continue;
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,1,3,2,1,6,9,7 };
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}