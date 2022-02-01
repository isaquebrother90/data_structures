package main.java.one.digitalinnovation.circularlinkedlist;

import main.java.one.digitalinnovation.doublylinkedlist.DoubleNode;

public class CircularLinkedListEx<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularLinkedListEx() {
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);
        if (this.listSize == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public void remove(int index) {
        if (index >= this.listSize) {
            throw new IndexOutOfBoundsException("The index is bigger than list size!");
        }

        Node<T> auxNode = this.tail;
        if (index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if (index == 1) {
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        } else {
            for (int i = 0; (i < index - 1); i++) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The list is empty!");
        }

        if (index == 0) {
            return this.tail;
        }

        Node<T> auxNode = this.tail;
        for (int i = 0; (i < index) && (auxNode != null); i++) {
            auxNode = auxNode.getNextNode();
        }

        return auxNode;
    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public int size() {
        return this.listSize;
    }

    @Override
    public String toString() {
        String strReturn = "";

        Node<T> auxNode = tail;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "[Node{content=" + auxNode.getContent() + "}]---> ";
            auxNode = auxNode.getNextNode();
        }
        strReturn += this.size() != 0 ? "(Return to start)" : "[]";

        return strReturn;
    }
}
