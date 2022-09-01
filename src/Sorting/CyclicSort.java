package Sorting;

import java.util.Arrays;
import java.util.Objects;

public class CyclicSort {
    public static void main(String[] args) {
//        int[] nums = {3, 5, 1, 4};
//        sort(nums);
//        System.out.println(Arrays.toString(nums));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }

//    static void sort(int[] arr) {
//       for(int i = 0; i < arr.length; i++) {
//           while(arr[i] - 1 != i) {
//              swap(arr, i, arr[i]-1);
//           }
//       }
//    }

//    static void sort2(int[] arr) {
//        int i = 0;
//        while(i < arr.length) {
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]) {
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//    }
    static String sortSentence(String s) {

    String[] fixedArr = s.split(" ");
    StringBuilder sb = new StringBuilder();
    int i = 0;
        while(i < fixedArr.length) {
        char curr = fixedArr[i].charAt(fixedArr[i].length() - 1);
        int val = Character.getNumericValue(curr);
        int correct = val - 1;
        if(val < fixedArr.length && !Objects.equals(fixedArr[val], fixedArr[correct])) {
            swap(fixedArr, val, correct);
        }else {
            i++;
        }
    }
    // for(int j = 0; j < fixedArr.length; j++) {
    //     char curr = fixedArr[j].charAt(fixedArr[j].length() - 1);
    //
    //     int val = Character.getNumericValue(curr);
    //
    //     int correct = val - 1;
    //     if(val < fixedArr.length && fixedArr[val] != fixedArr[correct]) {
    //         swap(fixedArr, val, correct);
    //     }
    // }
        for(int j = 0; j < fixedArr.length; j++) {
        sb.append(fixedArr[j].substring(0, fixedArr[j].length() - 1));
        if(j != fixedArr.length - 1) sb.append(" ");
    }
        return sb.toString();
}
    static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
