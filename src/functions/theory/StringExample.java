package functions.theory;

public class StringExample {
    public static void main(String[] args) {
        String person = "Karthik";
        System.out.println(greet(person));
    }

    static String greet(String name) {
        return "Hello, how are you doing today " + name + "?";
    }
}
