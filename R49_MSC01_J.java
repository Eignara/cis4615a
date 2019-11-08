/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2cis4615;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R49_MSC01_J {
    public static final int DURATION=10000; // In milliseconds
    public static void main(String[] args) {
        System.out.println("This program runs on a loop with a 10000 millisecond wait.");
        try {
            nop();
        } catch (InterruptedException ex) {
            Logger.getLogger(R49_MSC01_J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Rule 49. Miscellaneous (MSC)
     * Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop
     * Rule 49-MSC01
    */
    
    //Do not use an empty infinite loop
    public static void nop() throws InterruptedException {
        while (true) {
          // Useful operations
          
          System.out.println("Waiting... ");
          Thread.sleep(DURATION);
          System.out.println("10000 milliseconds have passed.");
        }
    }
}
