package KeyinClass;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Create a new Linked List.

    public Node createSingleLinkedlist(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        System.out.println("A new Linked List has been created.");
        return head;
    }

    //Insert a new node into a Linked List

    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSingleLinkedlist(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            System.out.println(nodeValue + " has successfully been inserted at the beginning of the Linked List.");
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
            System.out.println(nodeValue + " has successfully been inserted at the end of the Linked List.");
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
            System.out.println(nodeValue + " has successfully been inserted into position " + (location+1)+ " of the Linked List.");
        }
        size++;

    }

    //Delete node in Linked List by Value

    public void deleteNodeByValue(int nodeValue) {
        if (head == null) {
            System.out.println("The list is empty, the value is not found.");
            return;
        }
        if (head.value == nodeValue) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
                System.out.println(nodeValue + " has been deleted, the Linked List is now empty.");
            }else {
                System.out.println(nodeValue + " has been deleted from the beginning of the Linked List.");
            }
            return;

        }else {
            Node tempNode = head;
            while (tempNode.next != null) {
                if (tempNode.next.value == nodeValue) {
                    Node nodeToDelete = tempNode.next;
                    tempNode.next = nodeToDelete.next;

                    if (nodeToDelete == tail) {
                        tail = tempNode;
                    }

                    size--;
                    System.out.println(nodeValue + " has successfully been deleted from the Linked List.");
                    return;
                }
                tempNode = tempNode.next;

            }

            System.out.println(nodeValue + " was not found in the Linked List.");
        }
    }

    //Delete node in Linked List by Position

    public void deleteNodeByLocation(int location) {
        // Case 1: Empty list or invalid location
        if (head == null) {
            System.out.println("The Linked List is empty.");
            return;
        }
        if (location < 0 || location >= size) {
            System.out.println("The location is not valid position in this Linked List.");
            return;
        }
        if (location == 0) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;System.out.println("The first value has been deleted, the Linked List is now empty.");
            }else {
                System.out.println("The first value has been deleted from the Linked List.");
            }
            return;
        }

        Node tempNode = head;
        int index = 0;

        while (index < location - 1) {
            tempNode = tempNode.next;
            index++;
        }

        Node nodeToDelete = tempNode.next;
        tempNode.next = nodeToDelete.next;

        if (nodeToDelete == tail) {
            tail = tempNode;
        }
        size--;
        System.out.println("Deletion from the Linked List is successful.");
        return;
    }


    }







