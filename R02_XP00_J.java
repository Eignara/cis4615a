/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2cis4615;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R02_XP00_J {
    public static void main(String[] args) {
       deleteFile();
        
    }
    
    /* Rule 02. Expressions (EXP)
     * Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
     * Rule 02-EXP00
    */
    
    //Do not ignore values returned by methods
    public static void deleteFile(){
        File someFile = new File("someFileName.txt");
        
        try {
            String message = "This is a new file that has been created.";
            FileWriter wr = new FileWriter(someFile);
            wr.write(message);
            
            System.out.println("Attempted to create file.");
            System.out.println("FileExists is: " + someFile.exists());
            
        } catch (IOException ex) {
            Logger.getLogger(R02_XP00_J.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       if (!someFile.delete()) {
             Logger.getLogger(R02_XP00_J.class.getName()).severe("File not deleted. Please try again.");
       }
       
       else{
           Logger.getLogger(R02_XP00_J.class.getName()).info("File sucessfully deleted.");     }
      }
    
    
}
