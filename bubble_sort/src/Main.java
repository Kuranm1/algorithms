import java.util.Arrays;

class Main {
    public static void bubbleSort(int[] arr) {

        int length = arr.length - 1;
        // loop n times, where n is array size
        for (int i = 0; i < length; i++) {
            // loop on each element and compare it with next one
            for (int j = 0; j < length - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    // bubble element up one step if its greater than next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}