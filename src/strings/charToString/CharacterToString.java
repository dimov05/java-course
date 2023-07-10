package strings.charToString;

public class CharacterToString {
    public static void main(String[] args) {
        char givenChar = 'x';
        String str2 = String.valueOf(givenChar);
        String str3 = Character.toString(givenChar);
        String str4 = "" + givenChar;
        String str5 = String.format("%c", givenChar);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
