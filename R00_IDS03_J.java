/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2incorrect;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R00_IDS03_J {
    public static void main(String[] args) {
       String correctUser = "userName", correctPass = "cPass";
       Scanner input = new Scanner(System.in);
       String username, password;
       System.out.println("Enter username: ");
       username = input.next();
       
       System.out.println("Enter password: ");
       password = input.next();
       
       IDS03(IDS03Check(username, correctUser, password, correctPass), username);
       
    }
    
    
    /* Rule 00. Input Validation and Data Sanitization (IDS)
     * NONCOMPLIANT CODE
     * Rule 00-IDS03
    */
    
    //Do not log unsanitized user input
    public static void IDS03(boolean loginSuccessful, String username){
        Logger logger = Logger.getLogger(R02_XP00_J.class.getName());
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
          } else {
            logger.severe("User login failed for: " + username);
          }
        
    }
    
    
    public static boolean IDS03Check(String username, String correctUser, String password, String correctPass){
        boolean success = false;
        
        if(username.equals(correctUser) && password.equals(correctPass))
            success = true;
        
        return success;
    }
    
}
