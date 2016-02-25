/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms;
import com.kam.algorithms.UnionFind;

/**
 *
 * @author Blacksteath
 */
public class UnionFinder implements UnionFind {
    int[] id;
    public UnionFinder(int N){
        this.id = createArray(N);
        
    }
    @Override
    public void union(int start, int end) {
        
    }

    @Override
    public boolean connected(int start, int end) {
        return false;
    }

    @Override
    public int findRoot(int start) {
        return 0;
    }
    
    public int[] createArray(int N){
        int[] unionArray = new int[N];
        for(int i= 0; i < unionArray.length; i++ ){
            unionArray[i]= i;
        }
        return unionArray;
    }
    
}
