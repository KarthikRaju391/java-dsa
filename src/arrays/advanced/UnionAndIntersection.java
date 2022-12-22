package arrays.advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3, 4, 5, 6, 7};


        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }

    static ArrayList<Integer> union (int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else if(arr1[i] > arr2[j]) {
                list.add(arr2[j]);
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i < arr1.length) {
            list.add(arr1[i++]);
        }
        while(j < arr2.length) {
            list.add(arr2[j++]);
        }

        return list;
    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;
    }
}
