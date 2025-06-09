//Description: A simple program to explore Linked Lists, focused on how to delete entities.  Below find 2 methods, one
//             to delete by location in a Linked List, another will find the specific value.
//Author: DC Elliott
//Date June 8/2025
package KeyinClass;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        SingleLinkedList test = new SingleLinkedList();

        test.createSingleLinkedlist(111);
        printList(test);

        test.insertLinkedList(222,0);
        printList(test);

        test.insertLinkedList(333,2);
        printList(test);

        test.insertLinkedList(444,2);
        printList(test);

        test.insertLinkedList(555,1);
        printList(test);

        test.insertLinkedList(666,9);
        printList(test);

        test.insertLinkedList(777,0);
        printList(test);

        test.deleteNodeByValue(777);
        printList(test);

        test.deleteNodeByValue(666);
        printList(test);

        test.deleteNodeByValue(42);
        printList(test);

        test.deleteNodeByLocation(4);
        printList(test);

        test.deleteNodeByLocation(0);
        printList(test);

        test.deleteNodeByLocation(23);
        printList(test);

    }

    public static void printList(SingleLinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = list.head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" (Size: " + list.size + ")");
        System.out.println();

    }
}