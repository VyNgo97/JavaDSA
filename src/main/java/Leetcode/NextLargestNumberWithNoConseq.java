package main.java.Leetcode;

public class NextLargestNumberWithNoConseq {

    public static void main(String[] args) {
        int res = nextLargest(10000);
        System.out.println(res);
    }
    /*
    * Given an integer N, find the next largest number that doesn't have consecutive numbers
    * i.e. 76 -> 78 because 77 has 2 consecutive numbers
    * Naive Algorithm:
    *  - find next largest number (add 1)
    *  - check if there are any consecutive numbers
    *   - if yes, increment by 1
    *   - if no, return number
    * */

    public static int nextLargest(int val) {
        int nextVal = val + 1;
        boolean consec = true;

        while (consec) {
            if (!findConsecutive(nextVal)) {
                nextVal++;
            } else {
                consec = false;
            }
        }

        return nextVal;
    }

    public static boolean findConsecutive(int next) {
        while (next > 0) {
            if (next % 10 == (next / 10) % 10) {
                return false;
            } else {
                next = next / 10;
            }
        }
        return true;
    }
}
