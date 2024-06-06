package hashmap.exer.sherzod;

import java.util.Iterator;

public class Users implements Iterable<User> {
    private final User[] array;

    public Users(User[] array) {
        this.array = array;
    }


    @Override
    public Iterator<User> iterator() {
        return new UserIterator(array);
    }
}
