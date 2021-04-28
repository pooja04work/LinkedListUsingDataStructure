package com.bridgelabz;

public class MyNode<T> {
    private T data;
    private MyNode next;

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return next;
    }

    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }
}
