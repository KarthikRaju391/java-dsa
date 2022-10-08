package Capgemini;

public class DivBy5Or7 {
    public static void main(String[] args) {
        f(20);
    }

    static void f(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 5 == 0) System.out.println(i);
            if(i % 7 == 0) System.out.println(i);
        }
    }
}
