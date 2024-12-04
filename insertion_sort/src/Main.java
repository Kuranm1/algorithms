import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,1,6,3,8,5,1};
        System.out.println("Array Before Insertion Sort: ");
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("Array After Insertion Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}