package hashmap.exer.lesson6;

import java.util.Iterator;

public class HashMapIterator<K, V> implements Iterator<HashMap.Entry<K, V>> {
    private final HashMap.Entry<K, V>[] entries;
    private int cursorPosition = 0;

    public HashMapIterator(HashMap.Node<K, V>[] table, int size) {
        this.entries = new HashMap.Entry[size];
        initEntries(table);
    }

    private void initEntries(HashMap.Node<K, V>[] table) {
        int i = 0;
        for (HashMap.Node<K, V> node : table) {
            while (node != null) {
                entries[i++] = node.item;
                node = node.next;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return cursorPosition < entries.length;
    }

    @Override
    public HashMap.Entry<K, V> next() {
        return entries[cursorPosition++];
    }
}
