package arrays.advanced;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
         int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
         Arrays.sort(arr);
         System.out.println(findSumInABetterWay(arr, 9));
    }

    static List<List<Integer>> findSumInABetterWay(int[] arr, int target) {
        List<List<Integer>> sum = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int remTarget = target - (arr[i] + arr[j]);
                int left = j + 1;
                int right = n - 1;
                while(left < right) {
                    int remSum = arr[left] + arr[right];
                    if(remSum < remTarget) {
                        left++;
                    } else if(remSum > remTarget) {
                        right--;
                    } else {
                        List<Integer> ls = new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[left]);
                        ls.add(arr[right]);
                        sum.add(ls);
                        while(left < right && arr[left] == ls.get(2)) ++left;
                        while(left < right && arr[right] == ls.get(3)) --right;
                    }
                }
                // Check for duplicates while incrementing j
                while(j + 1 < n && arr[j + 1] == arr[j]) ++j;
            }
            // Check for duplicates while incrementing i
            while(i + 1 < n && arr[i + 1] == arr[i]) ++i;
        }

        return sum;
    }
    /*
        This has a complexity of n^3logn + nlogn
     */
    static HashSet<List<Integer>> findSum(int[] arr, int target) {
        HashSet<List<Integer>> sum = new HashSet<>();
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int remTarget = target - (arr[i] + arr[j] + arr[k]);
                    int res = binarySearch(arr, k + 1, n-1, remTarget);
                    if(res != -1) {
                        List<Integer> ls = new ArrayList<>();
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[k]);
                        ls.add(arr[res]);
                        sum.add(ls);
                    }
                }
            }
        }
        return sum;
    }


    static int binarySearch(int[] arr, int start, int end, int target) {
       while(start <= end) {
          int mid = start + (end - start) / 2;
          if(target > arr[mid]) {
              start = mid + 1;
          } else if(target < arr[mid]) {
              end = mid - 1;
          } else {
              return mid;
          }
       }
       return -1;
    }

}
