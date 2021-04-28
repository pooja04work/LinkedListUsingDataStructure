package com.bridegelabz;

import com.bridgelabz.LinkedList;
import com.bridgelabz.MyNode;
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


    }
}
