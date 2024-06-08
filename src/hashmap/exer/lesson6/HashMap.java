package hashmap.exer.lesson6;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HashMap<K, V> implements Iterable<HashMap.Entry<K, V>> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private Node<K, V>[] table;
    private final double loadFactor;
    private int size;

    public HashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public HashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_LOAD_FACTOR);
    }

    @SuppressWarnings("unchecked")
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
        int hash = Objects.hash(key);
        int index = hashIndex(hash);
        Node<K, V> node = table[index];
        if (node == null) {
            table[index] = new Node<>(hash, key, value);
            size++;
            return null;
        }
        Node<K, V> prev = null;
        while (node != null) {
            if (node.hash == hash && Objects.equals(key, node.item.key)) {
                V oldValue = node.item.value;
                node.item.value = value;
                return oldValue;
            }
            prev = node;
            node = node.next;
        }
        size++;
        prev.next = new Node<>(hash, key, value);
        return null;
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
    public Iterator<Entry<K, V>> iterator() {
        return new HashMapIterator<>(table, getSize());
    }


    public void forEach(BiConsumer<K, V> action) {
        for (Node<K, V> node : table) {
            Node<K, V> currentNode = node;
            while (currentNode != null) {
                action.accept(currentNode.item.key, currentNode.item.value);
                currentNode = currentNode.next;
            }
        }
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

    private int hashIndex(int hash) {
        return hash % table.length;
    }

    public Set<Entry<K, V>> getKeySet() {
        Set<Entry<K, V>> keys = new HashSet<>();
        for (Node<K, V> node : table) {
            Node<K, V> currentNode = node;
            while (currentNode != null) {
                keys.add(currentNode.item);
                currentNode = currentNode.next;
            }
        }
        return keys;
    }

    static class Node<K, V> {
        int hash;
        Entry<K, V> item;
        Node<K, V> next;

        Node(Entry<K, V> entry) {
            this.item = entry;
        }

        Node(int hash, K key, V value) {
            this.hash = Objects.hash(key);
            this.item = new Entry<>(key, value);
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner(", ");
            Node<K, V> currentNode = this;
            while (currentNode != null) {
                joiner.add(currentNode.item.toString());
                currentNode = currentNode.next;
            }
            return joiner.toString();
        }
    }

    public static class Entry<K, V> {
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
