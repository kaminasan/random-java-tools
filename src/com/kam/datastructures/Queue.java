/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructures;

/**
 *
 * @author Blacksteath
 */
public class Queue {
    
    final Node head;
    Node tail;
    
    public Queue(){
        head = new Node();
        head.nodeLoad = null;
        tail = null;
        
        
    }
    
   public boolean enqueue(String newString){
        Node newTail = new Node();
        newTail.nodeLoad = newString;
        newTail.next = null;
        if(isEmpty()){
            tail = newTail;
            head.next = tail;
            return true;
        }
        
        else{
            tail.next = newTail;
            tail = newTail;
            return true;
        }
    }
   
   public String dequeue(){
       Node nodeToReturn;
       String toReturn;
       if(isEmpty()){
           return null;
       }
       else{
           nodeToReturn = head.next;
           head.next = nodeToReturn.next;
           toReturn = nodeToReturn.nodeLoad;
       }
       return toReturn;
   }
    public boolean isEmpty(){
        return head.next == null;     
    }
    
    private class Node{
        String nodeLoad;
        Node next;
    }
    
    public void display(){
        Node currentNode = head.next;
        if(currentNode == null){
            System.out.println("Nothing in the QEUE");
        }
        while(currentNode != null){
            System.out.print(currentNode.nodeLoad +" -");
            currentNode = currentNode.next;
        }
       System.out.println();
    }
}
