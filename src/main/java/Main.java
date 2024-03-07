public class Main {
    public static void main(String[] args) {
    SimpleArrayList list = new SimpleArrayList();

    list.add(1);
    list.add(2);
    list.add(3);

    Integer[] elementsToAdd = {4, 5, 6, 7,8,66,76,77,56,76};
    //list.addAll(elementsToAdd);

    System.out.println("Size: " + list.size());
    //System.out.println("Contains 54: " + list.contains(54));
    //System.out.println("Index of 4: " + list.indexOf(4));

    //list.remove(2);

    System.out.println("Size after removal: " + list.size());
    //System.out.println("Contains 2 after removal: " + list.contains(2));
}
}

