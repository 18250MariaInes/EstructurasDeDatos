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
    /**
     *metodo de gnomesort de: http://www.geekviewpoint.com/java/sorting/gnomesort
     * @param theArray array a arreglar
     * @return el array ya arreglado
     */
    static Comparable []  gnomeSort( Comparable[] theArray ) { 
      for ( int index = 1; index < theArray.length; ) { 
         if ( theArray[index - 1].compareTo(theArray[index]) <= 0 ) { 
            ++index; 
         } else { 
            Comparable tempVal = theArray[index]; 
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
