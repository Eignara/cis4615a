/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework2cis4615;

import homework2cis4615.R01_DCL00_J;


/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R01_DCL00_J {
    private int balance = 0;
    private static final int deposit = (int) (Math.random() * 100); // Random deposit
    private static final R01_DCL00_J c = new R01_DCL00_J();  // Inserted after initialization of required fields
    
    /* Rule 01. Declarations and Initialization (DCL)
     * Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles
     * Rule 01-DCL00
    */
    
    //Prevent class initialization cycles
    public R01_DCL00_J() {
      System.out.println("Deposit is a random integer, and the balance is deposit - 10.");
      balance = deposit - 10; // Subtract processing fee
    }

    public static void main(String[] args) {
      System.out.println("The account balance is: " + c.balance);
    }
}
