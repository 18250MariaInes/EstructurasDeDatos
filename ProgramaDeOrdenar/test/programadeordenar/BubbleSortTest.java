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
public class BubbleSortTest {
    @Test
    public void testBubblesort() {
        System.out.println("bubblesort");
        Comparable[] input = {8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5};
        BubbleSort instance = new BubbleSort();
        instance.bubblesort(input);
        for (int i = 1; i < input.length; i++) {
          if (input[i - 1].compareTo(input[i])>0) {
            fail("bubblesort method fails.");
          }
        }
      }
    
}
