/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructs;

/**
 *
 * @author teacher
 * @param <E>
 */
public class LinkedList<E> {
     private Node head = null;
     private Node tail = null;
     private int size = 0;
    
     public LinkedList(){
         head = new Node(null);
         tail = null;
        
         
     }
     
     public void add(E element){
         Node newNode = new Node(element);
         if(tail != null){
             tail.setNext(newNode);
             tail = newNode;
             System.out.println("Added new Node.");
         }
         
         else{
             tail = newNode;
             head.setNext(tail);
             System.out.println("Added first Node");
            
         }
         size++;
     }
     
  
     
     
     
     public String printList(LinkedList<E> linked ){
         StringBuilder sb = new StringBuilder();
         
        
         Node currentNode = linked.head.next;
         while( currentNode != null){
             sb.append(currentNode.getPayload().toString() + ",");
             currentNode = currentNode.getNext();
         }
         return "[" + sb.toString() + "Size: " + linked.size + "]";
}
     
     public void pop(){
         if(this.size == 0){
             System.out.println("Error: list Empty");
             return;
         }
         if(this.size == 1){
            this.head.setNext(null);
             tail = null;
             size--;
         }
         else{
             Node currNode = this.head;
             Node previousNode = null;
             while(currNode != null){
              if(currNode.getNext() == null){
                  previousNode.setNext(null);
                  tail = previousNode;
                  size--;
                  return;
              } 
              else{
                  previousNode = currNode;
                  currNode = currNode.getNext();
                  
              }
             
             }
         }
     }
    private class Node{
        private Node next = null;
        private E payload;
         Node(E load){
             payload = load;   
             
         }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getPayload() {
            return payload;
        }

        public void setPayload(E payload) {
            this.payload = payload;
        }
         
     }
    
}
