/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.datastructures;

/**
 *
 * @author Blacksteath
 * @param <E>
 */
public interface LinkedList<E> {
    public void add(E element);
    public E remove(E element);
    public int size();
    public void display();
    
}
