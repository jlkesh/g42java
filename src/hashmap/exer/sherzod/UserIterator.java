package hashmap.exer.sherzod;

import java.util.Iterator;

public class UserIterator implements Iterator<User> {

    int currentIndex = 0;
    private final User[] array;

    public UserIterator(User[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public User next() {
        return array[currentIndex++];
    }
}