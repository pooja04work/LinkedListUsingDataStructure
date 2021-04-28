package com.bridegelabz;

import com.bridgelabz.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest<T>  {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
        MyNode<T> myFirstNode  =  new   MyNode(70);
        MyNode<T> mySecondNode =  new   MyNode(30);
        MyNode<T> myThirdNode  =  new   MyNode(56);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);

        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
