package Recursion.ArrayQuestions;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 9, 10, 15};
        boolean res = checkSorted(arr, arr.length);
        if(res) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    static boolean checkSorted(int[] arr, int length) {
        if(length == 1) {
            return true;
        }

        if(arr[length - 1] < arr[length - 2]) {
            return false;
        }

        return checkSorted(arr, length-1);
    }
}
