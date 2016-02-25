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
             
         }
         else if(this.size == 1){
            this.head.setNext(null);
             tail = null;
             size--;
         }
         else{
             Node currNode = this.head.next; //start withthe node past the head. If it is null, we have a size 0 list.
             Node previousNode = this.head;
             while(currNode != null){  //we will go across the List as long as our current Node != null
              if(currNode.getNext() == null){ //if our currentNodes next pointer is null, we are at the last Node in the list
                  previousNode.setNext(null); //We are deleting the current Node, as it is the last item. 
                  tail = previousNode;  //tail is now the previous node.
                  size--;
                  
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
