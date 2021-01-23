package org.collections;

import java.util.LinkedList;


// find the loop in a linked list without hashing
// find the intersection points between 2 linked list
// reverse a single linked list
// delete 3rd node from last in a linked list
// find the middle node of a linked list without knowing the length of the linked list at first
// merge 2 sorted linked list into another sorted linked list
public class LinkedListList {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node head = n1;

        System.out.println(head);

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;

        }
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void m1(String[] args) {
//        List<String> list = new LinkedList<>();

        LinkedList<String> list = new LinkedList<>();
        list.addLast("john");
        list.addLast("doe");
        list.addLast("alex");

        System.out.println(list);

        list.removeLast();

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        list.get(0);
    }

}
