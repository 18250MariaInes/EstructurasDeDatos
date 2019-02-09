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
import static org.junit.Assert.assertFalse; 
import static org.junit.Assert.assertTrue; 


/**
 *
 * @author maria
 */
public class MergeSortTest {
    
     @Test 
 public void defaultConstructorTest() { 
  // Static tool class still has default constructor (to get 100% coverage 
  // we need to test it too) 
  new MergeSort(); 
 } 
    @Test
  public void testMergesort() {
        System.out.println("mergesort");
        Comparable[] input = {8, 5, 3, 1, 9, 6, 0, 7, 4, 2, 5};
        MergeSort instance = new MergeSort();
        instance.mergeSort(input);
        for (int i = 1; i < input.length; i++) {
      if (input[i - 1].compareTo(input[i])>0) {
        fail("mergesort method fails.");
      }
    }
  }
    
}
