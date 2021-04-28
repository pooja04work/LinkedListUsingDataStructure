package com.bridgelabz;

public class LinkedList implements List<INode>  {
    private INode head;
    private INode tail;

    public LinkedList() {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public void add(INode newNode) {
        if (this.tail == null){
          this.tail = newNode;
        }

        if (this.head == null){
            this.head = newNode;
        }

        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
}
