package Capgemini;

import java.util.Arrays;

public class NumAsSumOfTwoPrimes {
    public static void main(String[] args) {
//        System.out.println(findTwoPrimes(28));
        int[] arr = {4, 3, 11, 2, 7, 8};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    // can I do the same for two sum?
    // Like, I will check if the element is there in the array twice using binary search
    // the time complexity will be O(nlogn)
    static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            int val = found(arr, target - arr[i]);
            if(val != -1 && val > i) {
                return new int[] {i, val};
            }
        }
        return new int[] {};
    }

    static int found(int [] arr, int element) {
        int s = 0;
        int e = arr.length;
        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(element > arr[mid]) {
                s = mid + 1;
            } else if(element < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static String findTwoPrimes(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(checkPrime(i)) {
                if(checkPrime(n - i)) {
                    return i + " + " + (n - i);
                }
            }
        }
        return "Not possible";
    }

    static boolean checkPrime(int n) {
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }else {
                c++;
            }
        }
        return true;
    }
}
