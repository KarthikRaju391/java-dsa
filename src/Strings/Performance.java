package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series+=ch;
        }
        System.out.println(series.charAt(series.length() - 1));
        StringBuilder newSeries = new StringBuilder();
        for(int i = 0; i < 26; i++) {
           char ch = (char) ('a' + i);
           newSeries.append(ch);
        }

        System.out.println(newSeries);
    }
}
