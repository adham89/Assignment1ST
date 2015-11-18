/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingassignment1;

/**
 *
 * @author ad
 */
public class DifferentMethods {
    
    
    public int additionOfTwoNumbers(int a, int b){
        return  a+b;
    }
    
    
    public int substractionOfTwoNumbers(int x, int y){
        return x-y;
    }
    
    public int countCharsInAString(String characters){
        
       StringBuilder sb = new StringBuilder();
       sb.append(characters);
        
        return sb.length();
    }
    
    public boolean isPalindrom(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
