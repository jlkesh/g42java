import java.util.StringTokenizer;

public final class StringTokenizationExample {

    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("hello|guys|how|are|you", "|", true);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println("stringTokenizer.nextToken() = " + stringTokenizer.nextToken());
        }

        String[] tokens = "hello|guys|how|are|you".split("\\|");
        for (String token : tokens) {
            System.out.println("token = " + token);
        }

    }
}
