package main.java.one.digitalinnovation.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedListEx<String> mineLinkelist1 = new LinkedListEx<>();
        mineLinkelist1.add("teste1");
        mineLinkelist1.add("teste2");
        mineLinkelist1.add("teste3");
        mineLinkelist1.add("teste4");

        System.out.println(mineLinkelist1.get(0));
        System.out.println(mineLinkelist1.get(1));
        System.out.println(mineLinkelist1.get(2));
        System.out.println(mineLinkelist1.get(3));

        System.out.println(mineLinkelist1);

        System.out.println(mineLinkelist1.remove(3));

        System.out.println(mineLinkelist1);

        /*Node<String> node1 = new Node<>("String test");

        //list1.inputReference = node1;
        list1.add(node1.getContent());

        System.out.println(node1.toString());
        System.out.println(list1.toString());
        System.out.println();
        System.out.println(node1.toStringCustomized());
        System.out.println();

        Node<String> node2 = new Node<>("String test 2");
        LinkedListEx list2 = new LinkedListEx<>();

        //list1.inputReference = node1;
        list2.add(node2.getContent());

        System.out.println(node2.toString());
        System.out.println();
        System.out.println(node2.toStringCustomized());*/

    }
}
