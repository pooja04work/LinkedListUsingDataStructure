package com.bridgelabz;

public class LinkedList implements List<INode>  {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
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
    public void printMyNode(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getdata());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getdata());
        System.out.println(myNodes);
    }


//    @Override
//    public void addLast(INode newNode) {
//        if (this.head == null){
//            this.head = newNode;
//        }
//        if (this.tail == null){
//            this.tail = newNode;
//        }
//        else{
//            INode tempNode = this.tail;
//            this.tail = newNode;
//            this.tail.setNext(tempNode);
//        }
}
