/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teacher
 */
public class StringSplitter {
    public static void main(String[] args) {
        StringSplitter splitter = new StringSplitter();
        List<String> list = splitter.split(",Hello,, my name is, Ms. Fairlady!", ',');
        System.out.println(list.toString());
    }
    public List<String> split(String toSplit, char delimiter){
        List<String> splitList = new ArrayList<String>();
        
        StringBuilder currString = new StringBuilder();
        for(int i = 0; i< toSplit.length(); i++){
            char currChar = toSplit.charAt(i);
            if(currChar == delimiter && currString.length() !=0){ //prevent adding empty string
                splitList.add(currString.toString());
                currString = currString.delete(0, currString.length());
                continue;
            }
            else if(currChar == delimiter){
                continue;
            }
            
            else{
                currString.append(currChar);
            }
            
        }
        if(currString.length()>0){
            splitList.add(currString.toString());
        }
        return splitList;
    }
}
