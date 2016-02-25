/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Blacksteath
 */
public class Permutations {
    public static void main(String[] args) {
        Permutations perm = new Permutations();
   
        List<String> permutations = new ArrayList<>(); 
             perm.permutate(permutations, "", "youarenotcool");
           
             System.out.println(permutations.size());
             
    }
    
    void permutate(List<String> listToUse, String current, String mutateMe){
        String permutated = current; //We take the currently permutated string
        String toPermutate = mutateMe;
        for(int i = 0; i < mutateMe.length(); i++){    //This will take the currently permutated string, and then put the letter at i in it, then 
            //we want to put each letter into the permutated list so it goes like 'A'BCD >> 'B'ACD >> 'C'ABD >> 'D'ABC, and then call the function again with the current mutation in place. This gets all the mutations after it.
            if(mutateMe.length() == 1){
                listToUse.add(permutated+mutateMe); //if mutateMe is 1, it means we have permutated everything before it.
            }
            else{
            permutate(listToUse, current + mutateMe.charAt(i), mutateMe.substring(0, i) + mutateMe.substring(i+1)); //we take the currently mutated string, pass it on
        }
        }
    }
}
