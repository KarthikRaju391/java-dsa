package Practice;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(sol("asklj3"));
    }

    static int sol(String str) {
        if(str.equals("")) {
            return -1;
        }
        char last = str.charAt(str.length() - 1);
        String newStr = "";
        int res = 0;
        if(Character.isDigit(last)) {
            newStr = str.substring(0, str.length() - 1);
            res = newStr.length() % 10;
        } else {
            res = str.length() % 10;
        }
        return res;
    }
}
