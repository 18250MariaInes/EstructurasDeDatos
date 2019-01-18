/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaderadio;

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
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toggle method, of class Radio.
     */
    @Test
    public void testToggle() {
        System.out.println("toggle");
        Radio instance = new RadioImpl();
        instance.toggle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Radio.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeFrequency method, of class Radio.
     */
    @Test
    public void testChangeFrequency() {
        System.out.println("changeFrequency");
        Radio instance = new RadioImpl();
        instance.changeFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStation method, of class Radio.
     */
    @Test
    public void testChangeStation() {
        System.out.println("changeStation");
        boolean up = false;
        Radio instance = new RadioImpl();
        instance.changeStation(up);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Radio instance = new RadioImpl();
        boolean expResult = false;
        boolean result = instance.getFrequency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStation method, of class Radio.
     */
    @Test
    public void testSaveStation() {
        System.out.println("saveStation");
        int numButton = 0;
        Radio instance = new RadioImpl();
        instance.saveStation(numButton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeStationButton method, of class Radio.
     */
    @Test
    public void testChangeStationButton() {
        System.out.println("changeStationButton");
        int numButton = 0;
        Radio instance = new RadioImpl();
        instance.changeStationButton(numButton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class Radio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        Radio instance = new RadioImpl();
        double expResult = 0.0;
        double result = instance.getStation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RadioImpl implements Radio {

        public void toggle() {
        }

        public boolean getState() {
            return false;
        }

        public void changeFrequency() {
        }

        public void changeStation(boolean up) {
        }

        public boolean getFrequency() {
            return false;
        }

        public void saveStation(int numButton) {
        }

        public void changeStationButton(int numButton) {
        }

        public double getStation() {
            return 0.0;
        }
    }
    
}
