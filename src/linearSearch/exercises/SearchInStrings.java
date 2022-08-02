package linearSearch.exercises;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Karthik";
        char target = 'K';
        System.out.println(search(name, target));
        System.out.println(searchInRange(name, target, 1, 5));
    }

    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchInRange(String name, char target, int start, int end) {
        if(name.length() == 0) {
            return false;
        }

        for(int i = start; i < end; i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
