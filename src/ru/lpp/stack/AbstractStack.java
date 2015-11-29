package ru.lpp.stack;


/**
 * Created by poul on 29.11.15.
 */
public abstract class AbstractStack implements IStack {
    private int size;

    public final boolean isEmpty() {
        return size == 0;
    }

    public final int size() {
        return size;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return popS();
    }

    public Object peek() {
        if (size == 0) {
            return null;
        }
        return peekS();
    }

    public void push(Object value) {
        pushS(value);
        size++;
    }

    abstract protected Object popS();

    abstract protected Object peekS();

    abstract protected void pushS(Object value);
}