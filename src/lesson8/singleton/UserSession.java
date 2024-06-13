package lesson8.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class UserSession {
    private List<Object> teachers = new ArrayList<>();
    private static UserSession USER_SESSION;// = new UserSession();//eager loading

    private UserSession() {
    }

    public synchronized static UserSession getInstance() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException ignoring) {
        }
        if (USER_SESSION == null){
            USER_SESSION = new UserSession();
        }

        return USER_SESSION;
    }
}
