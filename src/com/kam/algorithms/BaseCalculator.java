package com.kam.algorithms;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blacksteath
 * I thought other bases were very interesting, and it would be important to learn how to count in them, and convert to a base we understand natively.
 */

//this class takes numbers from other Bases and turns them into decimal/base10
public class BaseCalculator {
    
    
    
    public static void main(String[] args) {
        System.out.println("Decimal representation of Your number in base 2 is : " + baseXToDeci(1101101, 2));
        
     
    }
    
    
    
    
    /**
     * 
     * @param base5Number
     * What we are going to do is get the base 5 number, and cut off the last digit, using num/10 
     * multiply last digit by base^ power(counter)
     * @return 
     */
    public static int baseXToDeci(int baseXNumber, int baseToUse){
       final int BASE = baseToUse;
        int decimalNumber = 0;
        int basedNumber = baseXNumber;
        
       for(int power = 0; basedNumber > 0; power++ ){
           
          int currDigit = basedNumber % 10;
          System.out.println(currDigit);
          int toDecimal = (int)(currDigit * (Math.pow(BASE, power)));
          decimalNumber += toDecimal;
          basedNumber /= 10;
          System.out.println("New Based Number:" + basedNumber);
       }
       
       return decimalNumber;
    }
    
}
