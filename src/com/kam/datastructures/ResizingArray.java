/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructures;

import java.util.Arrays;

/**
 *
 * @author Blacksteath
 */
public class ResizingArray {
    private int[] ourArray = new int[1];
    private int index = 0;
    
    public void add(int number){
        if(isEmpty()) index = 0;
        if(index == ourArray.length){
            this.sizeUp();
            ourArray[index++] = number;
        }
        else{
            ourArray[index++] = number;
        }
    }
    
    public int removeLast(){
        int toReturn = 0;
        if(!isEmpty()){
           toReturn = ourArray[--index];
         ourArray[index+1] = 0;
        }
        if(index <= ourArray.length/4) sizeDown();
       
        return toReturn;
        
        
    }
    
  public void sizeUp(){
      ourArray = Arrays.copyOf(ourArray, ourArray.length *2);
      
  }
  
  public void sizeDown(){
      ourArray= Arrays.copyOf(ourArray, ourArray.length/2);
  }
  
  public boolean isEmpty(){
      return index ==-1;
  }
    public String display(){
        return Arrays.toString(ourArray);
    }
}
