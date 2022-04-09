package main.java.SortingAlgorithms;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        int[] result = bubbleSort(intArray);
        Arrays.stream(result).forEach(s -> System.out.println(s));
    }
    // note: you can't call a non static method from a static one because non static methods belong to an instance, not the entire class.
    public static int[] bubbleSort(int[] arr) {
        int unsortedPartitionIndex = arr.length-1;

        while (unsortedPartitionIndex > 0) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                // this sort because unstable if we do >= here. see notes for details
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                } else {
                    continue;
                }
            }
            unsortedPartitionIndex--;

        }
        return arr;
    }
}
