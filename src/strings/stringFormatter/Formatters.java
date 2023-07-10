package strings.stringFormatter;

public class Formatters {
    public static void main(String[] args) {
        String greetings = String.format(
                "Hello %2$s, welcome to %1$s !",
                "Baeldung", "Folks"
        );
        System.out.println(greetings);
    }
}
