package functions.exercises;

public class PythagoreanTriplet {
    public static void main(String[] args) {
       boolean result = checkTriplet(2, 1, 5);
        System.out.println(result);
    }
    static boolean checkTriplet(int a, int b, int c) {
        return a * a + b * b == c || a * a + c * c == b || b * b + c * c == a;
    }
}
