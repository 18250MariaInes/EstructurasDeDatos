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
public class QuickSortTest {
    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    
    @Test
    public void testNull() {
        QuickSort sorter = new QuickSort();
        sorter.sort(null);
    }

    @Test
    public void testEmpty() {
         QuickSort sorter = new QuickSort();
        sorter.sort(new int[0]);
    }

    @Test
    public void testSimpleElement() {
         QuickSort sorter = new QuickSort();
        int[] test = new int[1];
        test[0] = 5;
        sorter.sort(test);
    }

    @Test
    public void testSpecial() {
         QuickSort sorter = new QuickSort();
        int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
        sorter.sort(test);
        if (!validate(test)) {
            fail("Should not happen");
        }
        printResult(test);
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
    
}
