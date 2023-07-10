package strings.randomStringsGeneration;

import java.util.Random;

public class RandomStringGeneration {
    public static void main(String[] args) {
        String generatedRandomString = getRandomStringByPlainJava();
        System.out.println(generatedRandomString);

        generatedRandomString = getRandomStringUsingApacheUtils();
        System.out.println(generatedRandomString);
    }

    private static String getRandomStringUsingApacheUtils() {
        int length = 11;
        boolean useLetters = true;
        boolean useNumbers = false;
        //return RandomStringUtils.random(length, useLetters, useNumbers); must import apache commmon lang
        return "  ";
    }

    private static String getRandomStringByPlainJava() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'b'
        int targetStringLength = 11;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}
