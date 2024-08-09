package program;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head; // head of list

    // Method to insert a new node
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node moveToFront() {
        Node prev = null;
        Node last = head;
        while(last.next!=null){
            prev=last;
            last = last.next;
        }
        
        prev.next = null;
        last.next = head;
        head=last;
        return head;
    }

}

public class SingleLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("LinkedList elements:");
        list.display();

       list.moveToFront();
        list.display();
    }
}
