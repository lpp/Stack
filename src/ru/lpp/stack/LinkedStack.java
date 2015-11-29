package ru.lpp.stack;

/**
 * Created by poul on 29.11.15.
 */
public class LinkedStack extends AbstractStack  {
    private Node head;
    //private int size;

    protected void pushS(Object value) {
        head = new Node(head, value);
    }

    protected Object peekS() {
        return head.value;
    }

    protected Object popS() {
        final Object o = head.value;
        head = head.next;
        return o;
    }

    private static class Node {
        private final Object value;
        private final Node next;

        public Node(Node next, Object value) {
            this.value = value;
            this.next = next;
        }

    }


}
