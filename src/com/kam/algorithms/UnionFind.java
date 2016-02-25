/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms;


/**
 *
 * @author Blacksteath
 */
public interface UnionFind {
     public void union(int start, int end);
     
     public boolean connected(int start, int end);
     
     public int findRoot(int start);
     
    // public int count(); 
     
}
