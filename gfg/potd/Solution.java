package gfg.potd;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    void add(int newData) {
        Node newNode = new Node(newData);
        Node temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
}

public class Solution {

    public static Node addTwoLists(Node num1, Node num2) {
        StringBuilder s = new StringBuilder();
        for (Node temp = num1; temp != null; temp = temp.next) {
            s.append(temp.data);
        }
        // System.out.println(s);
        
        StringBuilder t = new StringBuilder();
        for (Node temp = num2; temp != null; temp = temp.next) {
            t.append(temp.data);
        }
        // System.out.println(t);

        int sum = Integer.parseInt(s.toString()) + Integer.parseInt(t.toString());
        String k = Integer.toString(sum);

        // System.out.println(k);
        Node newN = new Node(0);
        Node current = newN;
        for (char c : k.toCharArray()) {
            current.next = new Node(Character.getNumericValue(c));
            current = current.next;
        }
        return newN.next;
    }

    public static void main(String[] args) {
        Node num1 = new Node(4);
        num1.add(5);

        Node num2 = new Node(3);
        num2.add(4);
        num2.add(5);

        Node sum = addTwoLists(num1, num2);
        printList(sum);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
