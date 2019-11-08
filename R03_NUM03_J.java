/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework2cis4615;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R03_NUM03_J {
    public static void main(String[] args) {
        
        try {
            System.out.println("Grabbing self file.");
            InputStream initialStream = new FileInputStream(new File("src//homework2cis4615//R03_NUM03_J.java"));
            DataInputStream dis = new DataInputStream(initialStream);
            System.out.println("Number is: " + getInteger(dis));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(R03_NUM03_J.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(R03_NUM03_J.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Rule 03. Numeric Types and Operations (NUM)
     * Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
     * Rule 03-NUM03
    */
    
    //Use integer types that can fully represent the possible range of unsigned data

    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
      }
}
