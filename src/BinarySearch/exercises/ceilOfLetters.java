package BinarySearch.exercises;

public class ceilOfLetters {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f'};
        char target = 'b';
        System.out.println(getCeil(letters, target));
    }

    static char getCeil(char[] arr, char letter) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // calculating the middle element
            int mid = start + (end - start) / 2;

            if(letter < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
