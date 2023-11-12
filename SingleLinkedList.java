// SingleLinkedList.java
class Node {
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}

public class SingleLinkedList {
    Node head;

    public void append(int data) {
        Node current;
        if (head == null) {
            head = new Node(data);
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current = new Node(data);
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print("[ " + current.value);
            current = current.next;

        }
    }
}

class Test {

    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();
        myList.append(1);
        myList.append(2);
        myList.append(9);
        myList.display();
    }
}