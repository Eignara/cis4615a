/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2cis4615;

import java.io.Serializable;

/**
 *
 * @author Hadiya Najm NID=ha889474 PID=h3555944
 */
public class R14_SER00_J {
    public static void main(String[] args) {
        System.out.println("The number of weapons is an integer of 10.\nThe number will be printed as a string.");
       GameWeapon gw = new GameWeapon();
       System.out.println(gw.toString());
    }
}

/* Rule 14. Serialization (SER)
* Corrected code per: https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
* Rule 14-SER00
*/

//Enable serialization compatibility during class evolution
class GameWeapon implements Serializable {
    private static final long serialVersionUID = 24L;
    
    
    
    int numOfWeapons = 10;

    @Override
    public String toString() {
      return String.valueOf(numOfWeapons);
    }
  }