package strings.palindromes;

public class PalindromeCheckers {
    public static void main(String[] args) {
        String pal = "becsdsceb";
        String notPal = "asdagsvad";

        System.out.println(isPalindromeIterative(pal));
        System.out.println(isPalindromeIterative(notPal));

    }

    private static boolean isPalindromeIterative(String pal) {
        int start = 0;
        int end = pal.length() - 1;
        while (start < end) {
            char first = pal.charAt(start++);
            char last = pal.charAt(end--);
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
