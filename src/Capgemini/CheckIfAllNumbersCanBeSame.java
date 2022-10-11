package Capgemini;

public class CheckIfAllNumbersCanBeSame {
    public static void main(String[] args) {
        int[] arr = {50, 25, 100};
        System.out.println(check(arr));
    }

    static boolean check(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            while(arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            while(arr[i] % 3 == 0) {
                arr[i] /= 3;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
