public class LinkedList {
    private Node head;
    private Node tail;
    

    class Node {
        private int value;
        private Node next;
        private Node previous;
    }

    public void revert() {
        Node currNode = head;
            while (currNode != null) {
                Node next = currNode.next;
                Node previous = currNode.previous;
                currNode.next = previous;
                currNode.previous = next;
                if (previous == null) {
                    head = currNode;
                }
                if (next == null) {
                    head = currNode;
                }
                currNode = next;
            }
    }
}
