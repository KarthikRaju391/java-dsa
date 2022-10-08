package Capgemini;

public class Permutaion {
    public static void main(String[] args) {
        System.out.println(permutation(5, 9));
    }

    static int permutation(int n, int r) {
       return factorial(n) / factorial(n - r);
    }
    static int factorial(int n) {
        int fact = 1;
        for(int i = n; i > 0; i--) {
           fact *= i;
        }
        return fact;
    }
}
