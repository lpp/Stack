package ru.lpp.stack;

/**
 * Created by poul on 29.11.15.
 */
public class ArrayStack extends AbstractStack implements IStack {
    private Object[] elements = new Object[0];
//    private int size;

    public void pushS(Object value) {
        int stackSize = size();
        ensureCapacity(stackSize + 1);
        elements[stackSize] = value;
    }

    private void ensureCapacity(int capacity) {
        if (elements.length >= capacity) {
            return;
        }
        Object[] newElements = new Object[capacity * 2];
        for (int i = 0; i < size(); i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    protected Object popS() {
        return elements[size()];
    }

    protected Object peekS() {
        return elements[size() - 1];
    }

}
