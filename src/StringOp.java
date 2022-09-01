import java.util.Scanner;

public class StringOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = sc.nextLine();
        int res = findRes(binaryString);
        System.out.println(res);
    }

    static int findRes(String str) {

        int i = 0;
        int res = str.charAt(0) - '0';
        if(str == null) return -1;

        while (i < str.length()) {
            if(str.charAt(i) == 'A') {
                res &= str.charAt(i + 1) - '0';
            } else if(str.charAt(i)  == 'C'){
                res ^= str.charAt(i + 1) - '0';
            } else if(str.charAt(i)  == 'B'){
                res |= str.charAt(i + 1) - '0';
            }
            i++;
        }

        return res;
    }
}
