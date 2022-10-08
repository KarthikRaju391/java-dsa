package Recursion.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        int[] primes = {2};
        List<Integer> ans = new ArrayList<>();
        solve(10, 0, primes, ans);
        Collections.sort(ans);
        System.out.println(ans.get(0));
    }

    static void solve(int num, int count, int[] primes, List<Integer> ans) {
        if(num == 0) {
            ans.add(count);
            return;
        }
        if(num == 1) {
            return;
        }

        for (int prime : primes) {
            if (prime > num) break;
            num = num - prime;
            count++;
            solve(num, count, primes, ans);
            num = num + prime;
            count--;
        }
    }
}
