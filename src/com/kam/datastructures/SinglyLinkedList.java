/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructures;

/**
 *
 * @author Blacksteath
 * @param <E> will be anything that extends object
 */
public class SinglyLinkedList<E> implements LinkedList<E> {
       
    private final Node<E> head;
   private  Node<E> firstLink = null;
    private Node<E> tail = null;
    
    public SinglyLinkedList(){
        this.head = new Node<>(null);            //create an empty head with no Value
        head.next = null;                    //set the first element to null
        this.tail = head;                    //the tail is currently the head
                         //set the currentLink to where we are at in the list
        
    }

   
       private class Node<E>{
          Node<E> next = null; 
          E payload = null;
          
          
          Node(E element){
              this.payload = element;
              this.next = null;     
          }
          
      }
       
       
       
       
    @Override
    public void add(E element) {
        Node<E> newNode = new Node(element);
      if(firstLink == null){
          head.next = newNode;
          firstLink = head.next;    
          tail = firstLink;
      }
      else{
          tail.next = newNode; //set the current Last one's next to the new Node
          tail = newNode;
      }
    }

    @Override
    public E remove(E element) {
        Node lastNode = head;
        Node currentNode = head.next;
        
     
           
            
            while(currentNode != null){
                 if(currentNode.payload.equals(element)){
                     if(currentNode.equals(tail)) tail = lastNode;
                     lastNode.next = currentNode.next;
                    return (E) lastNode.payload;
                    
                }
                
               
                else{
                lastNode = currentNode;
                currentNode = currentNode.next;
                }
                
                
                
            }
        
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
    
     @Override
    public void display() {
        Node currentNode = head.next;
        System.out.print("LIST: [");
        while(currentNode != null){
            System.out.print(currentNode.payload);
            currentNode = currentNode.next;
            if(currentNode != null) System.out.print(",");
        }
         System.out.println("]");
    }
}
