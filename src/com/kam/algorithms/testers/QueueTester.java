/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms.testers;

import com.kam.datastructures.Queue;

/**
 *
 * @author Blacksteath
 */
public class QueueTester {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        System.out.println(myQ.dequeue());
        myQ.enqueue("Hello");
        myQ.enqueue("Fair");
        myQ.enqueue("Lady");
        myQ.display();
        myQ.dequeue();
        myQ.display();
        myQ.dequeue();
        myQ.display();
        myQ.dequeue();
        myQ.display();
    }
}
