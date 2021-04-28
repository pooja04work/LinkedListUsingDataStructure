package com.bridgelabz;

public class MyNode<T> implements INode<T> {
    private T data;
    private INode next;

    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public T getdata() {
        return data;
    }

    @Override
    public INode getNext() {
        return null;
    }

    @Override
    public void setNext(INode next) {

    }

    @Override
    public void setdata(T data) {
        this.data = data;
    }
}
