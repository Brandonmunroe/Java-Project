public class MyArrayList {
    private int[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // Add element at end
    public void add(int value) {
        ensureCapacity();
        data[size++] = value;
    }

    // Get element at index
    public int get(int index) {
        checkIndex(index);
        return data[index];
    }

    // Set element at index
    public void set(int index, int value) {
        checkIndex(index);
        data[index] = value;
    }

    // Remove element at index
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // Return current size
    public int size() {
        return size;
    }

    // Helpers
    private void ensureCapacity() {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    //Checking
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.set(1, 25);
        System.out.println(list.get(1));

        list.remove(0);
        System.out.println(list);
        System.out.println("Size: " + list.size()); // 2
    }
}
