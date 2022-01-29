package main.java.one.digitalinnovation.stack;

public class Main {

    public static void main(String[] args) {

        Stack mineStack = new Stack();

        mineStack.push(new Node(1));
        mineStack.push(new Node(2));
        mineStack.push(new Node(3));
        mineStack.push(new Node(4));
        mineStack.push(new Node(5));
        mineStack.push(new Node(6));

        System.out.println(mineStack);

        System.out.println(mineStack.pop());

        System.out.println(mineStack);

        mineStack.push(new Node(99));

        System.out.println(mineStack);

    }

}
