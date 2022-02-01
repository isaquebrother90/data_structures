package main.java.one.digitalinnovation.circularlinkedlist;

public class Main {

    public static void main(String[] args) {

        CircularLinkedListEx<String> mineCircularLinkedList = new CircularLinkedListEx<>();

        mineCircularLinkedList.add("c0");
        System.out.println(mineCircularLinkedList);

        mineCircularLinkedList.remove(0);
        System.out.println(mineCircularLinkedList);

        mineCircularLinkedList.add("c1");
        System.out.println(mineCircularLinkedList);

        mineCircularLinkedList.add("c2");
        mineCircularLinkedList.add("c3");
        System.out.println(mineCircularLinkedList);

        //System.out.println(mineCircularLinkedList.get(0));
        //System.out.println(mineCircularLinkedList.get(1));
        //System.out.println(mineCircularLinkedList.get(2));
        //System.out.println(mineCircularLinkedList.get(3));
        //System.out.println(mineCircularLinkedList.get(4));

        for (int i = 0; i < 20; i++) {
            System.out.println(mineCircularLinkedList.get(i));
        }

    }
}
