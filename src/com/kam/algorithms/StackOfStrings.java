/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms;

/**
 *
 * @author Blacksteath
 * @param <T>
 */
public class StackOfStrings<T>   {
    int totalSize;
    int currSize;
    int currPosition;
   
    Object[] somethingArray;
    public StackOfStrings(int size){
        this.totalSize = size;
       somethingArray = new Object[size];
        currSize = 0;
        currPosition = -1;
        
    }
     public static void main(String[] args) {
        StackOfStrings<String> stax = new StackOfStrings<>(3);
        stax.push("Hello");
        stax.popAll(stax);
        
        
    }
 
    public void push(T item) {
       if(currPosition == -1 ){
          somethingArray[++currPosition] = item;
           currSize++;
           System.out.println("Added: "+ item);
       }
       else if(currPosition + 1 <somethingArray.length){
          somethingArray[++currPosition] = item;
           currSize++;
           System.out.println("Added: "+ item);
           
       }
       else System.out.println("Stack OVERFLOW");
       
    }

   
    public T pop() {
        if(isEmpty()){
            System.out.println("EMPTY STACK");
        }
        else{
           T returnItem = (T)somethingArray[currPosition];
           somethingArray[currPosition--] = null;
            currSize--;
            return returnItem;
                 
        }
        return null;
    }

  
    public boolean isEmpty() {
       
        return currPosition == -1;
    }

    
    public int size() {
        return currSize;
    }
    
    public void popAll(StackOfStrings stack){
        for(int i = currPosition; !(isEmpty()); i--){
            System.out.println(stack.pop());
        }
        
    }
    
}
