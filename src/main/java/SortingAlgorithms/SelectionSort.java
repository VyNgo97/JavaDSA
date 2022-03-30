package SortingAlgorithms;

import java.util.Arrays;
public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] result = selectionSort(intArray);
        Arrays.stream(result).forEach(s -> System.out.println(s));
    }

    private static int[] selectionSort(int[] array) {

        for (int lastUnsortedIndex=array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = temp;

        }
        return array;
    }
}
