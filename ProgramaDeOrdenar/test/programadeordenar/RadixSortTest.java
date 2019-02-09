/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeordenar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class RadixSortTest {
    
    

    /**
     * Test of radixSort method, of class RadixSort.
     */
     @Test
  public void testRadixsort() {
    System.out.println("radixsort");
    Comparable[] input = {18, 5, 100, 3, 1, 19, 6, 0, 7, 4, 2};
    RadixSort instance = new RadixSort();
    instance.radixSort(input);
    for (int i = 1; i < input.length; i++) {
      if (input[i - 1].compareTo(input[i])>0) {
        fail("radixsort method fails.");
      }
    }
  }
}
