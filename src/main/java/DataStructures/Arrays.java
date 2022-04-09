package main.java.DataStructures;


public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[8];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;
        // O(n) - linear time for lookup via value and NOT index
        // O(1) - retrieval with index
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        //TODO: Move this to relevant spot but you can implicitly cast a char to its ascii representation like below. Used in valid anagram problem.
        int[] charArr = new int[256];
        String word = "apple";
        charArr[97] = 1;
        System.out.println(charArr[word.charAt(0)]);
    }

}
