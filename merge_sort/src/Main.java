import java.util.Arrays;

public class Main {
    public static int[] merge(int[] firstList, int[] secondList) {
        int length1 = firstList.length;
        int length2 = secondList.length;
        int[] result = new int[length1 + length2];

        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;

        while (index1 < length1 && index2 < length2) {
            if (firstList[index1] < secondList[index2]) {
                result[resultIndex++] = firstList[index1++];
            } else {
                result[resultIndex++] = secondList[index2++];
            }
        }
        while (index1 < length1) {
            result[resultIndex++] = firstList[index1++];
        }
        while (index2 < length2) {
            result[resultIndex++] = secondList[index2++];
        }
        return result;
    }

    // O(n log n)
    public static int[] mergeSort(int[] list) {
        int midIndex = list.length / 2;
        if(list.length == 1) return list;
        // O(log n)
        int[] left = mergeSort(Arrays.copyOfRange(list, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(list, midIndex, list.length));
        // O(n)
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] unsortedList = {1,9,7,3,6,4,2,0};
        System.out.println(Arrays.toString(mergeSort(unsortedList)));
    }
}