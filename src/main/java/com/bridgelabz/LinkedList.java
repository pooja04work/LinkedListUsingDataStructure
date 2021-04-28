package com.bridgelabz;

public class LinkedList<T> implements List<T>  {
    MyNode head;

    public MyNode getFirst() {
        return head;
    }

    @Override
    public boolean add(T number) {
        MyNode newData = new MyNode(number);
        if (head == null) {
            head = newData;
            return true;
        }
        return true;

    }
}
