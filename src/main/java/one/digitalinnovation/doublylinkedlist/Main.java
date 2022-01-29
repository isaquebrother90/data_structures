package main.java.one.digitalinnovation.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListEx<String> mineDoublyLinkedList = new DoublyLinkedListEx<>();

        mineDoublyLinkedList.add("c1");
        mineDoublyLinkedList.add("c2");
        mineDoublyLinkedList.add("c3");
        mineDoublyLinkedList.add("c4");
        mineDoublyLinkedList.add("c5");
        mineDoublyLinkedList.add("c6");
        mineDoublyLinkedList.add("c7");

        System.out.println(mineDoublyLinkedList);

        mineDoublyLinkedList.remove(3);
        mineDoublyLinkedList.add(3, "99");

        System.out.println(mineDoublyLinkedList);
        System.out.println(mineDoublyLinkedList.get(3));

        mineDoublyLinkedList.

    }
}
