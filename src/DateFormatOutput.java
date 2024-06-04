import java.util.Date;
import java.util.Locale;

public class DateFormatOutput {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf(Locale.ENGLISH, "%tB %n", date);
        System.out.printf(Locale.ITALY, "%tB %n", date);
        System.out.printf(Locale.ITALY, "%tb %n", date);
        System.out.printf(Locale.CHINA, "%tB %n", date);
        System.out.printf(Locale.CHINA, "%tb %n", date);
        System.out.printf("%tB/%<tA %n", date);
        System.out.printf("%TB/%<Ta %n", date);
        System.out.printf("%tY %n", date);
        System.out.printf("%ty %n", date);
        System.out.printf("%tj %n", date);
        System.out.printf("%tm %n", date);
        System.out.printf("%td %n", date); // 04
        System.out.printf("%te %n", date); // 4
        System.out.printf("%td/%<tm/%<ty %n", date);
        System.out.printf("%tD %n", date);
        System.out.printf("%td(%<tH:)-%<tm-%<tY %<tM:%<tS %n", date);
    }
}
