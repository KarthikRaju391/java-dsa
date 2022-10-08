package Capgemini;

public class StepsToReducerToOne {
    public static void main(String[] args) {
        System.out.println(reduce(87));
    }

    static int reduce(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n >= 4) {
            if(n % 2 == 1) return 3;
            return 2;
        }
        return 0;
    }
    static int reduceToOne(int n, int steps) {
        if(n == 1) {
           return steps;
        }
        if(n == 2) {
            return reduceToOne(n - 1, steps + 1);
        }
        int x = 0;
        if(n % 2 == 0) {
            for(int i = n - 1; i >= 2; i--) {
                if(n % i == 0) {
                    x = i;
                    break;
                }
            }
            return reduceToOne(n / x, steps + 1);
        }
        return reduceToOne(n - 1, steps + 1);
    }
}
