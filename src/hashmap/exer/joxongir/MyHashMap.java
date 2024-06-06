package hashmap.exer.joxongir;

public class MyHashMap<K, V> {

    private static class Entry<K, V> {
        private V v;
        private K k;
        private Entry<K, V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    private Entry<K, V>[] bucket;


    public MyHashMap() {
        bucket = new Entry[10];
    }


    public int Hash(K k) {
        return k.hashCode() % 10;
    }


    public V put(K k, V v) {
        int index = Hash(k);
        Entry<K, V> entry = bucket[index];
        if (entry == null) {
            bucket[index] = new Entry<>(k, v);
            return null;
        }


        while (entry.next != null) {
            if (entry.k.equals(k)) {
                V old = entry.v;
                entry.v = v;
                return old;
            }
        }


        if (entry.k.equals(k)) {
            V old = entry.v;
            entry.v = v;
            return old;
        }


        entry.next = new Entry<>(k, v);
        return null;
    }


    public V get(K k) {
        int index = Hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry.next != null) {
            if (entry.k.equals(k)) {
                return entry.v;
            }
        }
        if (entry.k.equals(k)) {
            return entry.v;
        }
        return null;
    }


    public boolean contains(K k) {
        int index = Hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry.next != null) {
            if (entry.k.equals(k)) {
                return true;
            }
        }
        if (entry.k.equals(k)) {
            return true;
        }
        return false;
    }


    public int size() {
        return bucket.length;
    }


    public void remove(K k) {
        int index = Hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry.next != null) {
            if (entry.k.equals(k)) {
                entry.v = null;
                entry.next = null;
            }
        }
        if (entry.k.equals(k)) {
            entry.v = null;
            entry.next = null;
        }
    }


    private V replace(K k, V v) {
        int index = Hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry.next != null) {
            if (entry.k.equals(k)) {
                entry.v = v;
                return entry.v;
            }
        }


        if (entry.k.equals(k)) {
            entry.v = v;
            return entry.v;
        }
        return null;
    }


}
