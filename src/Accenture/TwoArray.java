package Accenture;

import java.lang.reflect.Array;
import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i = 0; i < arrSize; i++) {
           arr[i] = sc.nextInt();
        }
        int largest = getSecondLargest(arr);
        System.out.println(largest);
    }

    static int getSecondLargest(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even);
        System.out.println(odd);

        int evenLargest = even.get(even.size() - 2);
        int oddLargest = odd.get(odd.size() - 2);

        return evenLargest + oddLargest;
    }
}
