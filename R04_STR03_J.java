/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2incorrect;

import java.math.BigInteger;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R04_STR03_J {
    public static void main(String[] args) {
       CharactersAndStrings();
    }
    
    /* Rule 04. Characters and Strings (STR)
     * NONCOMPLIANT CODE
     * Rule 04-STR03
    */
    
    //Do not encode noncharacter data as a string
    public static void CharactersAndStrings(){
        System.out.println("The x's should be the same.");
        BigInteger x = new BigInteger("530500452766");
        
        System.out.println("x is " + x);
        
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        
        System.out.println("x is " + x);
    }
}
