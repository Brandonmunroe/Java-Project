import java.util.LinkedList;
import java.util.StringJoiner;

public class MyHashSet {

    public static final int DEFAULT_CAPACITY = 100;
    public static final double DEFAULT_LOAD_FACTOR = 0.75;

    private LinkedList<Integer>[] buckets = newTable(DEFAULT_CAPACITY);
    private int size = 0;

    public MyHashSet() {
    }

    public MyHashSet(int initialCapacity) {
        if (initialCapacity > 0) buckets = newTable(initialCapacity);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int key) {
        var chain = buckets[index(key)];
        return chain != null && chain.contains(key);
    }

    public void add(int key) {
        int i = index(key);
        var chain = buckets[i];
        if (chain == null) buckets[i] = (chain = new LinkedList<>());
        if (chain.contains(key)) return;
        chain.addFirst(key);
        if (++size > buckets.length * DEFAULT_LOAD_FACTOR) rehash();
    }

    public boolean remove(int key) {
        int i = index(key);
        var chain = buckets[i];
        if (chain == null) return false;
        boolean removed = chain.remove((Integer) key);
        if (removed) {
            size--;
            if (chain.isEmpty()) buckets[i] = null;
        }
        return removed;
    }

    public void clear() {
        buckets = newTable(buckets.length);
        size = 0;
    }

    @Override
    public String toString() {
        var join = new StringJoiner(", ", "{", "}");
        for (var chain : buckets)
            if (chain != null)
                for (int v : chain) join.add(String.valueOf(v));
        return join.toString();
    }

    private int index(int key) {
        return Math.floorMod(key, buckets.length);
    }

    @SuppressWarnings("unchecked")
    private static LinkedList<Integer>[] newTable(int cap) {
        return (LinkedList<Integer>[]) new LinkedList[cap];
    }

    private void rehash() {
        var old = buckets;
        buckets = newTable(old.length * 2);
        for (var chain : old)
            if (chain != null)
                for (int v : chain) {
                    int i = index(v);
                    if (buckets[i] == null) buckets[i] = new LinkedList<>();
                    buckets[i].addFirst(v);
                }
    }

    public static void main(String[] args) {
        var set = new MyHashSet();
        set.add(1);
        set.add(101);
        set.add(-5);
        set.add(1);
        System.out.println(set.contains(101));
        System.out.println(set.remove(42));
        System.out.println(set.size());
        System.out.println(set);
    }
}