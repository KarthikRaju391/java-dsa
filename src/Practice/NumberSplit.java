package Practice;

public class NumberSplit {
    public static boolean isSplitNumber(int n) {
        // Check if the input is a valid non-negative integer
        if (n < 0) {
            return false;
        }

        // Calculate the square of the number
        int square = n * n;

        // Convert the square to a string
        String squareStr = String.valueOf(square);

        // Get the length of the square string
        int len = squareStr.length();

        // Check if the square string can be split into two parts that add up to the original number
        for (int i = 1; i < len; i++) {
            String part1 = squareStr.substring(0, i);
            String part2 = squareStr.substring(i);
            if (part1.length() > 0 && part2.length() > 0) {
                int num1 = Integer.parseInt(part1);
                int num2 = Integer.parseInt(part2);
                if (num1 + num2 == n) {
                    return true;
                }
            }
        }

        // If none of the splits are valid, return false
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSplitNumber(13));
    }
}
