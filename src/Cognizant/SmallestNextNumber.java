package Cognizant;

import java.math.BigInteger;
import java.util.Arrays;

public class SmallestNextNumber {
    public static void main(String[] args) {
        System.out.println(findNext("2147483486"));
    }

    static long findNext(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i;
        for(i = n - 1; i >= 0; i--) {
            if(i == 0) {
                return -1;
            } else {
                if(arr[i] > arr[i-1]) {
                    break;
                }
            }
        }

        int x = arr[i - 1], min = i;

        for(int j = i + 1; j < n; j++) {
            if(arr[j] > x && arr[j] < arr[min]) {
                min = j;
            }
        }
        swap(arr, i - 1, min);
        Arrays.sort(arr, i, n);
        String res =  new String(arr);
        long ret = Long.parseLong(res);
        return ret;
    }

    static void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
