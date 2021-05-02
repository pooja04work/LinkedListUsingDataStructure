package com.bridegelabz;

import com.bridgelabz.LinkedList;
import com.bridgelabz.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest<T>  {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<T> myFirstNode  =  new   MyNode(70);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(56);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.add(mySecondNode);
        linkedList.add(myThirdNode);
        linkedList.printMyNode();
        boolean result = linkedList.head.equals(myThirdNode) &&
                         linkedList.head.getNext().equals(mySecondNode) &&
                         linkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
        }
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.printMyNode();
        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.head.getNext().equals(mySecondNode) &&
                linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenPassLinkedListResult() {
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(myThirdNode);
        linkedList.insert(myFirstNode,mySecondNode);
        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.head.getNext().equals(mySecondNode) &&
                linkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenDeleteFirstElement() {
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.pop();
        linkedList.printMyNode();
        boolean result = linkedList.head.equals(mySecondNode) &&
                linkedList.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenDeleteLastElement() {
        MyNode<T> myFirstNode  =  new   MyNode(56);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(70);
        LinkedList linkedList = new LinkedList();
        linkedList.add(myFirstNode);
        linkedList.append(mySecondNode);
        linkedList.append(myThirdNode);
        linkedList.popLast();
        boolean result = linkedList.head.equals(myFirstNode) &&
                linkedList.tail.equals(mySecondNode);
        linkedList.printMyNode();
        Assert.assertTrue(result);
    }
}