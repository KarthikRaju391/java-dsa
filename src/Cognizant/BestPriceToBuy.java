package Cognizant;

public class BestPriceToBuy {
    public static void main(String[] args) {
       int[] nums = {-4527,-1579,-38732,-43669,-9287,-48068,-30293,-30867,18677};
       System.out.println(findMin(nums));
    }

    static int findMin(int[] arr) {
        int price = 0;
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            price += arr[i];
            if(price < min) {
                min = price;
            }
        }
        return min;
    }
}
