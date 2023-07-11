package strings.charOccurenceInString;

public class CountCharactersInString {
    public static void main(String[] args) {
        String s = "elephant";
        long count = getCountOfChar('e', s);
        long count2 = getCountOfCharIteratively('e', s);

        System.out.println(count);
        System.out.println(count2);
        System.out.println(count2);
    }

    private static long getCountOfChar(char ch, String s) {
        return s.chars().filter(ch1 -> ch1 == ch).count();
    }

    private static long getCountOfCharIteratively(char ch, String s) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

}
