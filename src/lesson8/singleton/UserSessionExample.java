package lesson8.singleton;

import java.util.Objects;

public class UserSessionExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                UserSession instance = UserSession.getInstance();
                System.out.println(System.identityHashCode(instance));
            }).start();
            Objects.requireNonNullElseGet(null,()->{
                // d;f;sdfds;
                return 12;
            });
        }
    }
}
