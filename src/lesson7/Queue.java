package lesson7;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

@SuppressWarnings("unchecked")
public class Queue<T> {
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size = 0;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        this.elements = new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return elements.length == size;
    }

    public void enqueue(T element) {
        if (isFull()) {
            throw new IllegalStateException("queue is full");
        }
        elements[size++] = element;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        T element = (T) elements[0];
        Object[] temp = new Object[elements.length];
        System.arraycopy(elements, 1, temp, 0, size--);
        this.elements = temp;
        return element;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(String.valueOf(elements[i]));
        }
        return joiner.toString();
    }
}
