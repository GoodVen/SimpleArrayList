import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleArrayListTest {

   /* @Test
    public void testAdd() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    public void testAddNegative() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(-1);
        assertEquals(1, list.size());
        assertEquals(-1, list.get(0));
    }

    @Test
    public void testRemove() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.remove(2));
        assertEquals(2, list.size());
        assertEquals(3, list.get(1));
    }

    @Test
    public void testRemoveNotExist() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertFalse(list.remove(-2));
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testRemoveAtIndex() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeAtIndex(2);
        assertEquals(2, list.size());
        assertEquals(2, list.get(1));
    }
    @Test
    public void testRemoveAtIndexNotExist() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.removeAtIndex(5);
        });
        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testAddAll() {
        SimpleArrayList list = new SimpleArrayList();
        Integer[] elementsToAdd = {1, 2, 3};
        list.addAll(elementsToAdd);
        assertEquals(3, list.size());
        assertEquals(2, list.get(1));
    }

    @Test
    public void testAddAllNegative() {
        SimpleArrayList list = new SimpleArrayList();
        Integer[] elementsToAdd = {-1,-2, -3};
        list.addAll(elementsToAdd);
        assertEquals(3, list.size());
        assertEquals(-2, list.get(1));
    }

    @Test
    public void testContains() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.contains(2));
        assertFalse(list.contains(4));
    }

    @Test
    public void testGet() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        assertEquals(2, list.get(1));
    }

    @Test
    public void testGetNotExist() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(5);});
    }

    @Test
    public void testIndexOf() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.indexOf(2));
        assertEquals(-1, list.indexOf(4));
    }

    @Test
    public void testSize() {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void iterator() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void addAll() {
    }

    @Test
    void testAddAll1() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void clear() {
    }

    @Test
    void get() {
    }

    @Test
    void set() {
    }

    @Test
    void testAdd1() {
    }

    @Test
    void testRemove1() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void listIterator() {
    }

    @Test
    void testListIterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void testClear() {
    }

    @Test
    void testGet1() {
    }

    @Test
    void testSet() {
    }

    @Test
    void testAdd2() {
    }

    @Test
    void testRemove2() {
    }

    @Test
    void testIndexOf1() {
    }*/
}

