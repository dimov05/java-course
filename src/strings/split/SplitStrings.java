package strings.split;

import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        String test = "You know the wifi password!";
        String[] split1 = Arrays.stream(test.split("\\s+"))
                .map(String::trim)
                .toArray(String[]::new);

        String[] split2 = test.split("\\s+");
        System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split2));
    }
}
