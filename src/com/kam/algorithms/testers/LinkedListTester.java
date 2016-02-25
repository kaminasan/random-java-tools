/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms.testers;

import com.kam.datastructures.SinglyLinkedList;

/**
 *
 * @author Blacksteath
 */
public class LinkedListTester {
    
    public static void main(String[] args) {
        SinglyLinkedList<String> myList = new SinglyLinkedList<>();
        myList.add("Hello");
        myList.add("Here We are");
        myList.add("JuggerNAUT");
        myList.display();
        myList.remove("Here We are");
        myList.remove("JuggerNAUT");
        myList.remove("Hello");
        myList.display();
        myList.add("I am back");
        myList.display();
    }
}
