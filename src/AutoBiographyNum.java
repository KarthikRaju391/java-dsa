import java.util.ArrayList;

public class AutoBiographyNum {
    public static void main(String[] args) {
      ArrayList<Character> res = checkAutoBio("1210");
        System.out.println(res);
    }
    static ArrayList<Character> checkAutoBio(String str) {
        ArrayList<Character> list = new ArrayList<>();
        if(str == null) return list;
        char[] arr = str.toCharArray();

        boolean autobio = false;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] - '0' == i) {
                    count++;
                }
            }
            autobio = count == arr[i]-'0';
        }
        if(autobio) {
           for(int i = 0; i < arr.length; i++) {
               for(int j = 0; j < arr.length; j++) {
                   if(arr[i] != arr[j] && !list.contains(arr[i])) {
                       list.add(arr[i]);
                   }
               }
           }
           return list;
        }
        return list;
    }

    static void distinct(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] - '0' == arr[j] - '0'){
                    break;
                }
                if(i == j) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}
