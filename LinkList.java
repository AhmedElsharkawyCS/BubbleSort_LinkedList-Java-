/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort_llist;

import static java.nio.file.Files.size;

/**
 *
 * @author Ahmed_Elsharkawy
 */
public class LinkList {
 
    
     Node   n,headpointer;
    int size;

    public LinkList() {
        headpointer = null;
        size = 0;
    }

    public void addToLinkedList(int mData) {
        Node newNode = new Node(mData);
        if (headpointer == null) {
            headpointer = newNode;
            return;
        }

        Node last = headpointer;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

   

    public void sorting(String typesortin) {
        int count = 0;

        do {
            Node prev = null;
            n = headpointer;
            count = 0;
            for (int i = 1; i < size && n.next != null; i++) {
                if (n.info > n.next.info) {
                    if (typesortin.equals("SBV")) {
                        swapByVlaue();
                    } else {
                        replaceByRefrence(n, prev);
                    }
                    count = 1;
                }
                prev = n;
                n = n.next;
            }
        } while (count == 1);
    }

    private void swapByVlaue() {
        Node temp = new Node(n.info);
        n.info = n.next.info;
        n.next.info = temp.info;
    }

    private void replaceByRefrence(Node node, Node prev) {

        Node temp = node.next;
        if (node == headpointer) {
            node.next = node.next.next;
            temp.next = node;
            headpointer = temp;
            printingtoList();
            System.out.println();

            return;
        } else if (node.next.next == null) {
            n.next = null;
            temp.next = node;
            prev.next = temp;

        } else {
            node.next = node.next.next;
            temp.next = node;
            prev.next = temp;
            printingtoList();
            System.out.println();

            return;
        }

    }

    public void printingtoList() {

        Node n = headpointer;
        while (n != null) {
            System.out.print(n.info + " || ");
            n = n.next;
        }
        System.out.println("\n");
    }

     class Node {

        Node next;
        int info;

        Node(int val) {//access nodes(values ,date)
            info = val;
            next = null;
        }
    }
}