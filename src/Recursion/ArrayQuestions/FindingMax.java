package Recursion.ArrayQuestions;

public class FindingMax {
    public static void main(String[] args) {
       int[] arr = {9, 5, 6, 3, 2};
       int res = findMax(arr, 0);
        System.out.println(res);
    }

    static int findMax(int[] arr, int index) {
        int max = 0;
        if(index == arr.length) {
            return max;
        }

        if(arr[index] > max) {
            max = arr[index];
        }

        int maxFound = findMax(arr, index + 1);

        if(maxFound > max) {
            max = maxFound;
        }
        return max;
    }
}
