package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int ans = recCount(4040);
        System.out.println(ans);
    }

    static int recCount(int n) {
        return counter(n, 0);
    }
    static int counter(int n, int count) {
        if(n == 0) {
            return count;
        }

        if(n%10 == 0) {
            return counter(n/10, count+1);
        }
        return counter(n/10, count);
    }
}
