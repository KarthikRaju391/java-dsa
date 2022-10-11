package arrays;

import java.util.Arrays;

public class JugglingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        juggle(arr, 3, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void juggle(int[] arr, int k, int n) {
        // run the outer loop for k times
        int i, j, d = 0, temp;
        for(i = 0; i < gcd(n, k); i++) {
            temp = arr[i];
            j = i;
            while(true) {
               d = (j + k) % n;

               if(d == i) {
                   break;
               }
               arr[j] = arr[d];
               j = d;
            }
            arr[j] = temp;
        }
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
