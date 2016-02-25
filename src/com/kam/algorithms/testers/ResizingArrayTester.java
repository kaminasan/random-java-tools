/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms.testers;

import com.kam.datastructures.ResizingArray;

/**
 *
 * @author Blacksteath
 */
public class ResizingArrayTester {
    public static void main(String[] args) {
        ResizingArray array = new ResizingArray();
        for(int i = 0; i< 10; i++){
            array.add(i);
            System.out.println(array.display());
        }
        
        for(int i = 0; i< 10; i++){
            array.removeLast();
            System.out.println(array.display());
        }
        
    }
}
