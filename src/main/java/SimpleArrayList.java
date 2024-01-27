import java.util.Arrays;

public class SimpleArrayList {
    private static final int DEFAULT_SIZE = 10;

    private Integer[] array;
    private int size;

    public SimpleArrayList() {
        array = new Integer[DEFAULT_SIZE];
        size = 0;
    }

    public void add(Integer element) {
        ensureSize();
        array[size++] = element;
    }

    public void addAll(Integer[] elements) {
        ensureSize(size + elements.length);
        System.arraycopy(elements, 0, array, size, elements.length);
        size += elements.length;
    }

    public boolean remove(Integer element) {
        int index = indexOf(element);
        if (index != -1) {
            removeAtIndex(index);
            return true;
        }
        return false;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int numToMove = size - index - 1;
        if (numToMove > 0) {
            System.arraycopy(array, index + 1, array, index, numToMove);
        }
        array[--size] = null;
    }

    public boolean contains(Integer element) {
        return indexOf(element) != -1;
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public int indexOf(Integer element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    private void ensureSize() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void ensureSize(int minSize) {
        if (minSize > array.length) {
            int newCapacity = Math.max(DEFAULT_SIZE, minSize);
            array = Arrays.copyOf(array, newCapacity);
        }
    }
}

