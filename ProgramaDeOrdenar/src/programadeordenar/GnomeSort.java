/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeordenar;

/**
 *
 * @author maria
 */
/**/

public class GnomeSort {
    static int []  gnomeSort( int[] theArray ) { 
      for ( int index = 1; index < theArray.length; ) { 
         if ( theArray[index - 1] <= theArray[index] ) { 
            ++index; 
         } else { 
            int tempVal = theArray[index]; 
            theArray[index] = theArray[index - 1]; 
            theArray[index - 1] = tempVal; 
            --index; 
            if ( index == 0 ) { 
               index = 1; 
            }           
         } 
      } 
      return theArray;
    }
    
}
