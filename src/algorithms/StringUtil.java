package algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kameron Monterroso
 * This Class contains useful recreated String Utilities, such as trim for simple practice purposes.
 */
public class StringUtil {
    public static void main(String[] args){
        
        String myTestString = "Hello. This has no white space that is extra.";
        StringUtil.trim(myTestString);
        String testString2 = "     This has plenty of extra whitespace.  \n   "; 
        StringUtil.trim(testString2);
    }
    
    public static String trim(String stringToTrim){
        //Algorithm, go from front of String Builder, deleting all items that are whitespace, then go from back, deleting all items that are whitespace.
       StringBuilder sb= new StringBuilder(stringToTrim);
       System.out.println("Old String: " +sb);
       int i= 0;
       while(sb.charAt(i) == ' ' || sb.charAt(i) == '\n'){
           sb.deleteCharAt(i);
           
       }
       i= sb.length() -1;
       while(sb.charAt(i) == ' ' || sb.charAt(i) == '\n'){
           sb.deleteCharAt(i--);
       }
       System.out.println("New String: " + sb);
       return sb.toString();
    }
}
