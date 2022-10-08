package Accenture;

public class OperationC {
    public static void main(String[] args) {
        System.out.println(operationChoices(2, 16, 20));
    }

    static int operationChoices(int c, int a, int b) {
        return switch (c) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
    }
}
