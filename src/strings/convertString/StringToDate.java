package strings.convertString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String date = "15/10/2023";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy");
        Date convertedDate = formatter.parse(date);
        System.out.println(convertedDate);

    }
}
