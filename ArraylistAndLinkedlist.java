import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistAndLinkedlist {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");        // Adding elements
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        arrayList.add(1, "Blueberry"); // Adding at a specific position
        System.out.println("ArrayList after insertion: " + arrayList);

        arrayList.remove(2);           // Removing element
        System.out.println("ArrayList after removal: " + arrayList);

        System.out.println("Element at index 1: " + arrayList.get(1)); // Accessing element

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");         // Adding elements
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1, "Bear");     // Adding at a specific position
        System.out.println("LinkedList after insertion: " + linkedList);

        linkedList.remove(2);          // Removing element
        System.out.println("LinkedList after removal: " + linkedList);

        System.out.println("Element at index 1: " + linkedList.get(1)); // Accessing element
    }
}