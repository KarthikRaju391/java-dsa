package Recursion.ArrayQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] nums = {1, 5, 5, 23, 89};
        int found = searchElement(nums, nums.length, 5);
        ArrayList<Integer> foundInList = searchWithNewList(nums, nums.length, 5);
//        System.out.println(found);
        System.out.println(foundInList);
    }

    static int searchElement(int[] arr, int length, int target) {
        if(length == 0) {
            return -1;
        }

        if(arr[length - 1] == target) return length - 1;

        return searchElement(arr, length - 1, target);
    }


    static ArrayList<Integer> searchWithList(int[] arr, int length, int target, ArrayList<Integer> list) {
        int index = length - 1;
        if(length == 0) {
            return list;
        }

        if(arr[index] == target) list.add(index);

        return searchWithList(arr, length - 1, target, list);
    }

    static ArrayList<Integer> searchWithNewList(int[] arr, int length, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        int index = length - 1;
        if(length == 0) {
            return list;
        }

        if(arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromPreviousCalls = searchWithNewList(arr, length - 1, target);

        list.addAll(ansFromPreviousCalls);

        return list;
    }
}
