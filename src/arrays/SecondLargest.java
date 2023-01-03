package arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 8, 9, 6, 9 ,5 ,8};
        int max1 = findMax(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max1) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int max2 = findMax(arr);

        System.out.println(max1 + ", " + max2);
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i= 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
