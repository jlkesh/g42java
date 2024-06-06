package hashmap.exer.shahriddin;

public class MyHashMap<K, V> {
    public static class Entry<K, V> {
        private K k;
        private V v;
        private Entry<K, V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }


    public Entry<K, V>[] bucket;


    public MyHashMap(int size) {
        this.bucket = new Entry[size];
    }


    public V put(K k, V v) {
        int index = hash(k);
        Entry<K, V> entry = bucket[index];
        if (entry == null) {
            bucket[index] = new Entry<>(k, v);
            return null;
        }


        while (entry.next != null) {
            if (entry.k.equals(k)) {
                V oldV = entry.v;
                entry.v = v;
                return oldV;
            }
            entry = entry.next;
        }
        if (entry.k.equals(k)) {
            V oldV = entry.v;
            entry.v = v;
            return oldV;
        }
        entry.next = new Entry<>(k, v);
        return null;
    }


    public V get(K k) {
        int index = hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry != null) {
            if (entry.k.equals(k)) {
                return entry.v;
            }
            entry = entry.next;
        }
        return null;
    }


    public void print() {
        StringBuilder sb = new StringBuilder("[");
        for (Entry<K, V> entry : bucket) {
            if (entry != null) {
                sb.append(entry.k + "=" + entry.v + " ");
            }
        }
        sb.append("]");
        System.out.print(sb.toString());
    }


    public boolean contains(K k) {
        int index = hash(k);
        Entry<K, V> entry = bucket[index];
        while (entry != null) {
            if (entry.k.equals(k)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }

    private int hash(K k) {
        return k.hashCode() % 16;
    }
}
