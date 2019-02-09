/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package programadeordenar;

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
public class QuickSortTest {
    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;
    
    
    @Test
    public void testQuickSort() {
        System.out.println("Gnomesort");
        Comparable[] input = {18, 5, 100, 3, 1, 19, 6, 0, 7, 4, 2};
        QuickSort instance = new QuickSort();
        instance.sort(input);
        for (int i = 1; i < input.length; i++) {
          if (input[i - 1].compareTo(input[i])>0) {
            fail("radixsort method fails.");
          }
        }
    }
    
    private boolean validate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }

    /**
     * Test of sort method, of class QuickSort.
     */
    
    
}
