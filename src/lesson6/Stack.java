package lesson6;

import java.util.Objects;
import java.util.StringJoiner;

@SuppressWarnings("unchecked")
public final class Stack<E> {
    private static final int INITIAL_CAPACITY = 10;
    private final Object[] elements;
    private int size = 0;

    public Stack() {
        this(INITIAL_CAPACITY);
    }

    public Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    public void push(E e) {
        if (isFull()) {
            throw new IllegalStateException("stack is full");
        }
        elements[size++] = e;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return (E) elements[size - 1];
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        E element = (E) elements[--size];
        elements[size] = null;
        return element;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        var joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(Objects.toString(elements[i]));
        }
        return joiner.toString();
    }


}
