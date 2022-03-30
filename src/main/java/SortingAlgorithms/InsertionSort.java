package SortingAlgorithms;

import java.util.Arrays;
public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] res = insertionSort(intArray);
//        DataStructures.Arrays.stream(res).forEach(s -> System.out.println(s));
    }

    public static int[] insertionSort(int[] arr) {

        /*
        * 1. compare arr[i] vs. arr[i-1]
        *   a. if arr[i] > arr[i-1]: increment sortedIndex and i
        *   b. if arr[1] < arr[i-1]: swap the elements and keep comparing until condition a. is met
        * */
        int sortedIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[sortedIndex]) {
                sortedIndex++;
            } else {
                for (int j = i; j > 0; j--) {
                    if (arr[j] >= arr[j-1]) {
                        sortedIndex++;
                        break;
                    } else {
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                        System.out.println(Arrays.toString(arr));
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
