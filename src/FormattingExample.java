import java.util.Formattable;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class FormattingExample {
    static Logger logger = Logger.getLogger("XojiAkbarLogger");

    public static void main(String[] args) {
        double x = 5;
        double y = x / 3.0;
        System.out.println(y);
        System.out.printf("%1.2f %n", y);
        System.out.printf("%B %n", null);
        System.out.printf("%B %n", 123);
        System.out.printf("%b %n", false);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("your name : ");
        String name = scanner.nextLine();
        int age = random.nextInt(10, 40);
        // Hello John, Are you 28 years old ?
        System.out.printf("Hello %S, Are you %d years old ?%n", name, age);
        System.out.printf("Hello %2$d, Are you %1$S years old ?%n", name, age);

         System.out.printf("%2$+5.2f--%1$-6.1f--%n", 12.12, 45.67);
         System.out.printf("%s %n", 12);
         System.out.printf("%s %n", 12.23);
         class Book implements Formattable {
             @Override
             public void formatTo(Formatter formatter, int i, int i1, int i2) {

             }
         }
         System.out.printf("%s %n", new Book());
         System.out.printf("%s %n", 12.23);
        // below 👌👌👌👌👌👌
    }

}
