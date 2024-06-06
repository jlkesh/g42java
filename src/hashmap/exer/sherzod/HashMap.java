package hashmap.exer.sherzod;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class HashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private Node<K, V>[] table;
    private double loadFactor;
    private int size;

    public HashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public HashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    public HashMap(int initialCapacity, double loadFactor) {
        this.table = new Node[initialCapacity];
        this.loadFactor = loadFactor;
    }

    public V put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("key can not be null");
        }
        if (size >= (int) (table.length * loadFactor)) {
            grow();
        }
        int index = hashIndex(key);
        Node<K, V> node = table[index];
        if (node == null) {
            table[index] = new Node<>(key, value);
            size++;
            return value;
        }
        Node<K, V> currentNode = node;
        while (true) {
            if (currentNode.item.key.equals(key)) {
                currentNode.item.value = value;
                return value;
            }
            if (currentNode.next == null) {
                currentNode.next = new Node<>(key, value);
                this.size++;
                return value;
            }
            currentNode = currentNode.next;
        }
    }

    private void grow() {
        Node<K, V>[] temp = table;
        table = new Node[table.length * 2];
        System.arraycopy(temp, 0, table, 0, temp.length);
    }

    public int getSize() {
        return size;
    }

    public int capacity() {
        return table.length;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (Node<K, V> node : table) {
            Node<K, V> currentNode = node;
            if (currentNode != null) {
                joiner.add(currentNode.toString());
            }
        }
        return joiner.toString();
    }

    private int hashIndex(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key can not be null");
        }
        return Objects.hash(key) % table.length;
    }

    class Node<K, V> {
        Entry<K, V> item;
        Node<K, V> next;

        Node(Entry<K, V> entry) {
            this.item = entry;
        }

        Node(K key, V value) {
            this.item = new Entry<>(key, value);
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner(", ");
            Node<K, V> currentNode = this;
            while (currentNode != null) {
                joiner.add(item.toString());
                currentNode = currentNode.next;
            }
            return joiner.toString();
        }
    }

    class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

}
