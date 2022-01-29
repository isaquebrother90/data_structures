package main.java.one.digitalinnovation.linkedlist;

public class LinkedListEx<T> {

    Node<T> inputReference;

    public LinkedListEx() {
        this.inputReference = null;
    }

    public void add(T content) {
        Node<T> nodeNew = new Node<>(content);

        if (this.isEmpty()) {
            inputReference = nodeNew;
            return;
        }

        Node<T> auxNode = inputReference;
        for (int i = 0; i < this.size() - 1; i++) {
           auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(nodeNew);

    }

    public T get(int index) {
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index) {

        indexValidate(index);
        Node<T> auxNode = inputReference;
        Node<T> returnNode = null;

        for (int i = 0; i <= index; i++) {
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return returnNode;
    }

    public T remove(int index) {

        Node<T> pivotNode = this.getNode(index);
        if (index == 0) {
            inputReference = pivotNode.getNextNode();
            return pivotNode.getContent();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getContent();
    }

    public int size() {
        int listSize = 0;
        Node<T> referenceAux = inputReference;
        while (true) {
            if (referenceAux != null) {
                listSize++;
                if (referenceAux.getNextNode() != null) {
                    referenceAux = referenceAux.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return listSize;
    }

    private void indexValidate(int index) {
        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("There is no content in the index " + index + " of this list. This list only goes as far as the index " + lastIndex + ".");
        }
    }

    public boolean isEmpty() {
        return inputReference == null ? true : false;
    }

    @Override
    public String toString() {
        String strReturn = "";
        Node<T> auxNode = inputReference;
        for (int i = 0; i < this.size(); i++) {
            strReturn += "[Node{content=" + auxNode.getContent() + "}]---> ";
            auxNode = auxNode.getNextNode();
        }
        strReturn += "null";

        return strReturn;
    }
}
