package Recursion.StringsAndSubsequence;

import java.util.Stack;

public class ArrSubSeq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int ans = countSubSeq(0, arr, arr.length, 0, 2);
        System.out.println(ans);
    }

    static boolean displaySubSeq(int ind, int[] arr, Stack<Integer> list, int n,int sum, int k) {
        if(ind == n) {
            if(sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        // take the current index value
        // list.add(arr[ind]);
        list.push(arr[ind]);
        sum += arr[ind];
        if(displaySubSeq(ind+1, arr, list, n, sum, k)) {
            return true;
        }

        // remove the current index value
        // list.size()-1
        list.pop();
        sum -= arr[ind];
        if(displaySubSeq(ind+1, arr, list, n, sum, k)){
            return true;
        }

        return false;
    }

    static int countSubSeq(int i, int[] arr, int n, int sum, int k) {
        if(i == n) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }

        // take the next index
        sum += arr[i];
        int left = countSubSeq(i+1, arr, n, sum, k);
        sum -= arr[i];
        int right = countSubSeq(i+1, arr, n, sum, k);

        return left + right;
    }
}
