package Hashmap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int dup = findDuplicate(arr);
        System.out.println(dup);
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // find the duplicate
//        for(int j = 0; j < arr.length; j++) {
//            if(arr[j] != j + 1){
//                return arr[j];
//            }
//        }

        // find the missing number
        for(int k = 0; k < arr.length; k++) {
            if(arr[k] != k + 1){
                return k + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
