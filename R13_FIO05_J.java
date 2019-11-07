/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2cis4615;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R13_FIO05_J {
    public static void main(String[] args) {
       Wrap wr = new Wrap();
       System.out.println(wr.getBufferCopy());
    }
}

/* Rule 13. Input Output (FIO)
* Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/FIO05-J.+Do+not+expose+buffers+created+using+the+wrap%28%29+or+duplicate%28%29+methods+to+untrusted+code
* Rule 13-FIO05
*/

//Do not expose buffers created using the wrap() or duplicate() methods to untrusted code
final class Wrap {
  private char[] dataArray;
 
  public Wrap() {
    System.out.println("This will go through and print the characters you type! Enter a string: ");
    Scanner input = new Scanner(System.in);
    
    String s = input.next();
    dataArray = new char[10];
    for(int i = 0; i < dataArray.length; i++)
        dataArray[i] = s.charAt(i);
    // Initialize
    System.out.println("Your string has been limited to 10 characters.");
  }
 
  public CharBuffer getBufferCopy() {
    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
  }
}