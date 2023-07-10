package strings.arraysToString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysToStringAndBack {
    public static void main(String[] args) {
        String[] strArray = {"one", "two", "three", "four", "five"};

        System.out.println(getStringFromArrayWithStringBuilder(strArray));
        System.out.println(getStringFromArrayWithArrayUtils(strArray));
        System.out.println(getStringFromArrayWithStreams(strArray));
    }

    private static String getStringFromArrayWithStreams(String[] strArray) {
        return Arrays.stream(strArray)
                .collect(Collectors.joining());
    }

    private static String getStringFromArrayWithArrayUtils(String[] strArray) {
        return Arrays.toString(strArray);
    }

    private static String getStringFromArrayWithStringBuilder(String[] strArray) {
        StringBuilder sb = new StringBuilder();
        for (String s : strArray) {
            sb.append(s);
        }
        return sb.toString();
    }

}
