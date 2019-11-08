/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework2cis4615;

import java.util.Scanner;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R06_MET01_J {
    public static void main(String[] args) {
       int x, y;
       System.out.println("We will add the absolute value of two numbers together.\nEnter the first number: ");
       Scanner input = new Scanner(System.in);
       
       x = input.nextInt();
       
       System.out.println("Enter the next number: ");
       y = input.nextInt();
       
        System.out.println(getAbsAdd(x,y));
    }
    
    /* Rule 05. Object Orientation (OBJ)
     * Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/OBJ05-J.+Do+not+return+references+to+private+mutable+class+members
     * Rule 05-OBJ05
    */
    
    //Do not return references to private mutable class members
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
          throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
          throw new IllegalArgumentException();
        }
        return absX + absY;
    }
}
