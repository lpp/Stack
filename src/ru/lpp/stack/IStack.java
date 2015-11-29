package ru.lpp.stack;

/**
 * Created by poul on 29.11.15.
 */
public interface IStack {

    void push(Object o);

    Object pop();

    Object peek();

    int size();
}
