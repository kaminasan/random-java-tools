/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructs;

/**
 *
 * @author teacher
 */
public class LinkedListTester {
    public static void main(String[] args){
       LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        System.out.println(list.printList(list));
        list.pop();
        System.out.println(list.printList(list));
        list.add("hello again");
        list.add("hello thrice");
        System.out.println(list.printList(list));
        list.pop();
  
    }
}
