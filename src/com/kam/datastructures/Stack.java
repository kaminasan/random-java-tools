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
public interface Stack {
    void push(String item);
    String pop();
    boolean isEmpty();
    int size();
}
