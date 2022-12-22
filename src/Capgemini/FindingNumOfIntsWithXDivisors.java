package Capgemini;

public class FindingNumOfIntsWithXDivisors {
    public static void main(String[] args) {
        System.out.println(check(7, 2));
    }

    static int check(int n, int x) {
        int count = 0;
        for(int i = 1; i <= n; i++) { // i -> 1, 2
            int count_factors = 0; // c -> 0
            for(int j = 1; j <= i; j++) { // j -> 1, i -> 1, 2
                if(i % j == 0) {
                    count_factors++;
                }
            }
            if(count_factors == x) {
                count++;
            }
        }
        return count;
    }
}
