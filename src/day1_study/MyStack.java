package day1_study;

import java.util.NoSuchElementException;

public class MyStack<T> {


    private static class StackNode<T> {
        private T data;
        private StackNode next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode top;

    public T pop() {
        if (top == null) throw new NoSuchElementException();
        T item = (T) top.data;
        top = top.next;

        return item;
    }

    public void push(T item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new NoSuchElementException();
        return (T) top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}