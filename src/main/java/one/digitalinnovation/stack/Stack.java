package main.java.one.digitalinnovation.stack;

public class Stack {

    private Node stackInputReference;

    public Stack() {
        this.stackInputReference = null;
    }

    public void push(Node newNode) {
        Node auxRef = stackInputReference;
        stackInputReference = newNode;
        stackInputReference.setRefNode(auxRef);
    }

    public Node pop() {
        if(!this.isEmpty()) {
            Node noPoped = stackInputReference;
            stackInputReference = stackInputReference.getRefNode();
            return noPoped;
        }
        return null;
    }

    public Node top() {
        return stackInputReference;
    }

    public boolean isEmpty() {
        /*if (stackInputReference == null) {
            return true;
        }*/
        return stackInputReference == null ? true : false;
    }

    @Override
    public  String toString() {

        String returnString = "-------------\n";
        returnString += "    Stack\n";
        returnString += "-------------\n";

        Node auxNode = stackInputReference;

        while (true) {
            if (auxNode != null) {
                returnString += "[Node{data=" + auxNode.getData() +"}]\n";
                auxNode = auxNode.getRefNode();
            } else {
                break;
            }
        }

        returnString += "=============\n";
        return returnString;

    }
}
