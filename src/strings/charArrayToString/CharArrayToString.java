package strings.charArrayToString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CharArrayToString {
    public static void main(String[] args) {
        final Character[] charArray = {'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g'};
        final char[] secondCharArray = {'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g'};
        System.out.println(charArrayToStringWithStringValueOf(secondCharArray));
        System.out.println(charArrayToStringWithArrayUtils(secondCharArray));
        System.out.println(charArrayToStringWithStringBuilder(charArray));
        System.out.println(charArrayToStringWithStreams(charArray));
    }

    private static String charArrayToStringWithArrayUtils(char[] charArray) {
        return Arrays.toString(charArray);
    }

    private static String charArrayToStringWithStringValueOf(char[] charArray) {
        return String.valueOf(charArray);
    }


    private static String charArrayToStringWithStringBuilder(Character[] charArray) {
        StringBuilder sb = new StringBuilder();
        for (char ch : charArray) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static String charArrayToStringWithStreams(Character[] charArray) {
        return Arrays.stream(charArray).map(String::valueOf).collect(Collectors.joining());
    }
}
