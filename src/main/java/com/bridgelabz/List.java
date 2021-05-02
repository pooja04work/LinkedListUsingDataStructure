package com.bridgelabz;

public interface List<INode> {
    void add(INode newNode);
    void append(INode newNode);
    void printMyNode();
    void insert(INode newNode, INode myNode);
    INode pop();
    INode popLast();
    boolean searchNode(int i);

}
