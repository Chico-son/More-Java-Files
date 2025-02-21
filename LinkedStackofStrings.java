public class LinkedStackofStrings {
    private class Node {
        private Node next;
        private String item;
    }

    private Node first; // root

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node newFirstNode = new Node();
        newFirstNode.item = item;
        newFirstNode.next = first;
        this.first = newFirstNode;
    }

    public String pop() {
        String poppedItem = first.item;
        this.first = first.next;
        return poppedItem;
    }

    public String toString() {
        String str = " ";
        Node n = first;
        while(n != null) {
            str += n.item + " ";
            n = n.next;
        }

        return str;
    }
}