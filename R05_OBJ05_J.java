/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2incorrect;

import java.util.Date;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R05_OBJ05_J {
    static Date d;
    
    
    public static void main(String[] args) {
       d = new Date();
        System.out.println("The date is: " + getDate());
    }
    
    
    /* Rule 05. Object Orientation (OBJ)
     * NONCOMPLIANT CODE
     * Rule 05-OBJ05
    */
    
    //Do not return references to private mutable class members
    public static Date getDate() {
        return d;
      }
}
