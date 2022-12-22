package Capgemini;

public class NumbersToWords {

    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
    "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        System.out.println(convertToWords(2_12_450));
    }

    static String numToWord(int n, String suffix) {
        String str = "";
        if(n > 19) {
            str += tens[n/10] + " " + ones[n%10] + " ";
        } else {
            str += ones[n] + " ";
        }
        if(n != 0) str += suffix;
        return str;
    }

    static String convertToWords(long n) {
        String res = "";
        res += numToWord((int) (n/10000000), "crores ");
        res += numToWord((int) ((n/100000)%100), "lakhs ");
        res += numToWord((int) ((n/1000)%100), "thousand ");
        res += numToWord((int) ((n/100)%10), "hundred ");
        if(n > 100 && n % 100 != 0) {
            res += "and ";
        }
        res += numToWord((int) (n%100), "");

        return res.trim();
    }
}
