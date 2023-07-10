package strings.stringToBigDecimal;

import java.math.BigDecimal;

public class StringToBigDecimal {
    public static void main(String[] args) {
        String num = "125312312321.312323332312312321331";
        BigDecimal number1 = new BigDecimal(num);
        BigDecimal number2 = BigDecimal.valueOf(Double.parseDouble(num));
        System.out.println(number1);
        System.out.println(number2);


    }
}
