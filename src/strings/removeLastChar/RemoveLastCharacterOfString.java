package strings.removeLastChar;

public class RemoveLastCharacterOfString {
    public static void main(String[] args) {
        String s = "testabcds";
        s = removeLastChar(s);
        System.out.println(s);
    }

    private static String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : s.substring(0, s.length() - 1);
    }
}
