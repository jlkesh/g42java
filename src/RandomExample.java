import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        byte[] bytes = new byte[100];
        random.nextBytes(bytes);
        System.out.println("bytes = " + Arrays.toString(bytes));
        // [1;10)
        int nextInt = random.nextInt(1, 11);
        System.out.println("nextInt = " + nextInt);
        // SecureRandom secureRandom = new SecureRandom();
        ThreadLocalRandom random1 = ThreadLocalRandom.current();
        System.out.println("random1.nextInt(1,11) = " + random1.nextInt(1, 11));
    }
}
