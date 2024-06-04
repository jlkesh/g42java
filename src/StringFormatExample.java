import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class StringFormatExample {

    public static void main(String[] args) {
        String format = String.format("digit : %d", 1200000000);
        String format2 = "digit : %d".formatted( 1200000000);
        System.out.println("format = " + format);
        System.out.println("format2 = " + format2);
        String format3 = MessageFormat.format(
                "My Name is {0},I am {1} years  old {2,date}"
                , "Sherzod", 27, new Date());

        System.out.println("format3 = " + format3);
    }

}
